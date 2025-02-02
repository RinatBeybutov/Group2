package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();
        final int pi = 3;
        //pi = 2;
        String s = "Hello world!";
        final ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);

        Int.print2();

        //ArrayList
        //LinkedList

        Optional<String> randomString = getRandomString();

        if(randomString.isPresent()) {
            String s1 = randomString.get();
            System.out.println(s1);
        }


    }

    private static Optional<String> getRandomString() {
        if(Math.random() < 0.5) {
            return Optional.of("Hello");
        } else {
            return Optional.empty();
        }
    }

}