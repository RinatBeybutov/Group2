package FunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //MyInterface dog = new Dog();

        //dog.printName();

        // Анонимный класс!
        MyInterface myInterface = new MyInterface() {
            @Override
            public void printName() {
                System.out.println("Snake!");
            }
        };

        myInterface.printName();

        Dog [] dogs = new Dog[] {
                new Dog( 10),
                new Dog( 16),
                new Dog( 9),
                new Dog( 3),
                new Dog( 12),
        };

        /**
         * Лябмда - сокращенный вид функционального интерфейса
         *
         * (входные параметры) -> реализация
         *
         */
        Predicate<Dog> isOldDog = dog -> dog.getAge() > 15;

        System.out.println(isOldDog.test(dogs[1]));

        Comparator<Dog> comparator = (o1, o2) -> {
            System.out.println(o1.getAge() - o2.getAge());
            return o1.getAge() - o2.getAge();
        };

        Arrays.sort(dogs, comparator);

        System.out.println();


    }
}
