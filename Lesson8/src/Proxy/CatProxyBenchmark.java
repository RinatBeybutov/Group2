package Proxy;

public class CatProxyBenchmark extends Cat {


    @Override
    public void meow() {
        long start = System.nanoTime();
        // Вызов родительского метода
        super.meow();
        long end = System.nanoTime();

        System.out.println("Время вызова родительского метода: " + (end - start));

    }
}
