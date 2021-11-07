package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        Future<Integer> tuKiedysBedzieInt = new SquareCalculator().calculate(10);

        while (!tuKiedysBedzieInt.isDone()) {
            System.out.println("Trwaja oibliczenia...");
            Thread.sleep(100);
        }
        System.out.println("Obliczono: " + tuKiedysBedzieInt.get());

    }


    static class SquareCalculator {

        private ExecutorService executor
                = Executors.newSingleThreadExecutor();

        public Future<Integer> calculate(Integer input) {
            return executor.submit(() -> {
                Thread.sleep(1000);
                return input * input;
            });
        }
    }
}
