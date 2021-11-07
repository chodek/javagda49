package concurrency.synchronizing;


public class CounterRunnable implements Runnable {
    private final Pair pair;

    public CounterRunnable(Pair pair) {
        this.pair = pair;
    }

    @Override
    public void run() {

        for (int idx = 0; idx < 100; idx++) {
            pair.incrementLeft();
            pair.incrementRight();
        }
        System.out.println(pair.getLeft() + " " + pair.getRight());

    }
}
