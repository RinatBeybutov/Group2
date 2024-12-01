package Proxy;

public class CatProxyLogger extends Cat {

    @Override
    public void meow() {
        System.out.println("Метод meow стартовал!");

        super.meow();

        System.out.println("Метод meow завершился!");
    }
}
