package wzorce.singleton;

public class SingletonEagerExample {
    private static final SingletonEagerExample INSTANCE = new SingletonEagerExample();

    private SingletonEagerExample() {
    }

    public static SingletonEagerExample getInstance() {
        return INSTANCE;
    }

    public void connectToDB() {
        // do sth
    }
}
