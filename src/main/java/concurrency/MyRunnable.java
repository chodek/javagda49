package concurrency;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 10000; i >= 0; i--) {
            System.out.println(i + " " + Thread.currentThread().getId());
        }
    }
}
