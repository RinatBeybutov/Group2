package org.example;

public interface Int {
    int a = 10;

    default void print() {
        System.out.println("Int");
    }

    default void print1() {
        System.out.println("Int");
    }

    static void print2() {
        System.out.println("Int");
    }


}
