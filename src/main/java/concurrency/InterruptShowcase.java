package concurrency;

public class InterruptShowcase {
    public static void main(String[] args) {
        Thread sleeepingThread = new Thread(new SleepingThread());
        sleeepingThread.start();
        sleeepingThread.interrupt();
    }

}

class SleepingThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Ide spac");
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Przerwano spanko :(");
        }

        System.out.println("Wychodze z watku");
    }
}
