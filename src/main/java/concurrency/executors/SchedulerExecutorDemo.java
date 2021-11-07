package concurrency.executors;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("Start coffee!: " + df.format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(5000);
                System.out.println("finish coffee!: " + df.format(Calendar.getInstance().getTime()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1, 6, TimeUnit.SECONDS);
        Thread.sleep(15000L);
        executorService.shutdown();
    }

}
