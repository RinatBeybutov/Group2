package org.example;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(new Database());
        System.out.println(service.getUser(1));
        System.out.println("-------------------");
        System.out.println(service.getUser(1));

        service.updateUser(new User(1, "Max"));

        System.out.println("-------------------");
        System.out.println(service.getUser(1));

        System.out.println("-------------------");
        System.out.println(service.getUser(1));

    }
}