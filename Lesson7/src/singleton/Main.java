package singleton;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * Синглтон
         * Адаптер
         * Наблюдатель
         *
         */

        System.out.println("Мы стартовали!");

        LazySingleton instance1 = LazySingleton.getInstance();

        LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() == instance2.hashCode());




    }
}