package wzorce.singleton;

public class SingletonLazyExample {


    private static SingletonLazyExample INSTANCE;

    private SingletonLazyExample() {
    }

    public static SingletonLazyExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazyExample();
        }
        return INSTANCE;
    }

    public void connectToDB() {
        // do sth
    }


}
