package concurrency;

public class Main {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        new Thread(() -> System.out.println("hehehe")).start();


    }
}
