package concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsCreationExample {
    public static void main(String[] args) throws InterruptedException {
        final int cpus = Runtime.getRuntime().availableProcessors();
        final ExecutorService singleThreadES = Executors.newSingleThreadExecutor(); // pula z pojedyncznym wątkiem
        final ExecutorService executorService = Executors.newFixedThreadPool(cpus); // pula z ilością wątków równą ilości cpu
        final ExecutorService cachedES = Executors.newCachedThreadPool();           // cached thread pool
        final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(cpus); // scheduled thread pool z ilością wątków równą ilości cpu

        singleThreadES.submit(() -> System.out.println());
    }

}
