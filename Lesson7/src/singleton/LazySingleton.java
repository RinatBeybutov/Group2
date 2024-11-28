package singleton;

public class LazySingleton {
    // Выполняется при старте приложения
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            System.out.println("Создали объект");
            instance = new LazySingleton();
        }
        return instance;
    }
}
