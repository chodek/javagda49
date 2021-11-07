package wzorce.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonLazyExample se = SingletonLazyExample.getInstance();
        se.connectToDB();

    }
}
