package org.example;

class ClassA {
    int x = 10;
}

class ClassB extends ClassA {
    int x = 20;

}

public class ClassMain {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        System.out.println(a.x);
    }
}