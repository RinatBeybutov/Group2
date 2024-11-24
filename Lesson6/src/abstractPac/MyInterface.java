package abstractPac;

public interface MyInterface {

    static void method() {
        System.out.println("Interface method");
    }

    default void defaultMethod() {
        System.out.println("Interface default method");
    }
}

