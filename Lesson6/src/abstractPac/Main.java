package abstractPac;

public class Main {
    public static void main(String[] args) {
        MyInterface.method();

        Parent parent = new ParentImpl(12);
        parent.defaultMethod();
    }
}
