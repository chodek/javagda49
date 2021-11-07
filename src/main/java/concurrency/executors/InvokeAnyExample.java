package concurrency.executors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    System.out.println("Wątek: " + Thread.currentThread().getName());
                    System.out.println("Robię zakupy");
                    Thread.sleep(5000);
                    System.out.println("Wątek: " + Thread.currentThread().getName() + ". Zrobiono zakupy!");
                    return "Zrobiono zakupy!";
                },
                () -> {
                    System.out.println("Wątek: " + Thread.currentThread().getName());
                    System.out.println("Mycie naczyń");
                    Thread.sleep(2000);
                    System.out.println("Wątek: " + Thread.currentThread().getName() + ". Umyto naczynia");
                    return "umyto naczynia";
                },
                () -> {
                    System.out.println("Wątek: " + Thread.currentThread().getName());
                    System.out.println("Sprzątanie pokoju");
                    Thread.sleep(1000);
                    System.out.println("Wątek: " + Thread.currentThread().getName() + ". Posprzątano pokój");
                    return "posprzątano pokój";
                }
        );
        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
