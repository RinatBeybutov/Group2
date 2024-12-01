package Proxy;

public class Main {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.meow();

        Cat cat = new CatProxyValidate();
        //cat.eat("korm");

        isBetween5and10(61);
    }

    public static void isBetween5and10(int num){
        if (num>=5 && num<=10){
            System.out.println("Between 5 and 10");
        } else {
            System.out.println("Not between 5 and 10");
        }
    }
}
