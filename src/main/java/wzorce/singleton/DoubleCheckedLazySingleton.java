package wzorce.singleton;

public class DoubleCheckedLazySingleton {


    private static DoubleCheckedLazySingleton INSTANCE;

    private DoubleCheckedLazySingleton() {
    }

    public static DoubleCheckedLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public void connectToDB() {
        // do sth
    }


}


