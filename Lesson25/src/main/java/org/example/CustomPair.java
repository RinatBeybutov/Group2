package org.example;

public class CustomPair {

    private String s1;
    private String s2;

    public CustomPair(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "Кастомный класс{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
