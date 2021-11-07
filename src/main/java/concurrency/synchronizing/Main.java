package concurrency.synchronizing;


public class Main {
    public static void main(String[] args) {
        final Pair pair = new Pair(0, 0);

        new Thread(new CounterRunnable(pair)).start();
        new Thread(new CounterRunnable(pair)).start();
    }
}
