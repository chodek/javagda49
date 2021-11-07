package concurrency.coordinating;

public class WaitShowcase {

    public static void main(String[] args) throws InterruptedException {
        final Customer customer = new Customer();
        final Thread withDrawThread = new Thread(new WithdrawThread(customer));
        final Thread depositThreadA = new Thread(new DepositThread(customer));
        final Thread depositThreadB = new Thread(new DepositThread(customer));

        withDrawThread.start();
        depositThreadA.start();
        depositThreadB.start();
    }
}

class Customer {
    private int availableAmount = 0;

    synchronized void withdraw(int amountToWithdraw) {
        System.out.println("Trying to withdraw " + amountToWithdraw + " PLN");
        while (availableAmount < amountToWithdraw) {
            System.out.println("Not enough money! Waiting for transfer!");
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Oops");
            }
        }
        availableAmount -= amountToWithdraw;
        System.out.println("Withdraw successful!");
    }

    synchronized void deposit(final int amountToDeposit) {
        System.out.println("Depositing " + amountToDeposit + " PLN");
        availableAmount += amountToDeposit;
        notify();
    }
}

class WithdrawThread implements Runnable {

    private final Customer customer;

    WithdrawThread(final Customer customer) {
        this.customer = customer;
    }


    @Override
    public void run() {
        customer.withdraw(1000);
    }
}


class DepositThread implements Runnable {
    private final Customer customer;

    DepositThread(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        customer.deposit(5000);
    }
}
