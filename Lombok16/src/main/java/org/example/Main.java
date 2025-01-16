package org.example;

public class Main {
    public static void main(String[] args) {
        Cat.CatBuilder builder = new Cat.CatBuilder();
        builder.age(12).color("black");
        Cat build = builder.build();
    }
}