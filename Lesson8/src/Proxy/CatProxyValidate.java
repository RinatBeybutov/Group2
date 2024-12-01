package Proxy;

public class CatProxyValidate extends CatProxyLogger {

    @Override
    public void eat(String foodName) {
        if (foodName == null || foodName.isEmpty()) {
            System.out.println("Please enter a food name!!!");
        } else {
            super.eat(foodName);
        }
    }
}
