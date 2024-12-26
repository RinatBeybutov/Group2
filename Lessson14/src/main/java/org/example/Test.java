package org.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // Что выведется?
        Boolean b = new Boolean("/true");
        System.out.println(b);

        // Задание 2
        int i = 5;
        // 5, i =6, i = 7, 7
        i = i++ + ++i;
        System.out.println("i = " + i);

        // private, protected, default (package private), public

        new B();

        // Работает!
        Test t = null;
        t.show();

        t = new Test();
        //t.test();

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        /*list.forEach(s -> {
            System.out.println(s);
            list.add("new" + s);
        });*/

        testPredicate();
    }

    private static void testPredicate() {
        String[] names = {"java", "kotlin", "java"};

        String name = "java";

        Predicate predicate = name::equals;

        long count1 = Stream.of(names).filter(predicate).count();
        name = "kotlin";
        long count2 = Stream.of(names).filter(predicate).count();

        System.out.println(count1 + " " + count2);



    }

    interface I {
        void print();
    }

    public I create() {
        return () -> System.out.println("Create");
    }

    private I i = this::create;

    public void test() {
        /**
         * create() - ссылка на лямбду, мы с ее помощью вызываем метод печати
         * this::create() - ссылка на метод create, он не вызывает метод печати
         */
        //I lambda = create();
        //lambda.print();
        //----------------------
        Runnable create = this::create;
    }

    public static void show() {
        System.out.println("Show");
    }
}
