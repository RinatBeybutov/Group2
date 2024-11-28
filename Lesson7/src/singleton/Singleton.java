package singleton;

public class Singleton {

    // Выполняется при старте приложения
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Start");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("error " + e.getMessage());
        }
        System.out.println("End");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
