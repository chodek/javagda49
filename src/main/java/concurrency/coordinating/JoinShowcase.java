package concurrency.coordinating;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoinShowcase {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> ints = new ArrayList<>();
        final Thread threadA = new Thread(new SimpleThread(ints));
        final Thread threadB = new Thread(new SimpleThread(ints));

        threadA.start();
        threadB.start();

        threadA.join(1000L);
        threadB.join(1000L);
        System.out.println(ints.size());
    }
}

class SimpleThread implements Runnable {

    private final List<Integer> ints;

    SimpleThread(final List<Integer> ints) {
        this.ints = ints;
    }

    @Override
    public void run() {
        synchronized (this.ints) {
            ints.add(new Random().nextInt());
        }
    }
}
