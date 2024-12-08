package PredicatTask;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /**
         * Вот задание на составление предикатов в Java:
         *
         * Создайте класс Person с полями name (имя) и age (возраст). Затем
         * создайте предикаты для проверки следующих условий:
         *
         * 1. isAdult: проверяет, является ли возраст человека 18 лет или больше.
         * 2. isTeenager: проверяет, находится ли возраст человека в диапазоне от
         * 13 до 19 лет включительно.
         * 3. isOlderThan: проверяет, является ли возраст человека старше заданного
         * значения.
         * 4. isYoungerThan: проверяет, является ли возраст человека младше заданного
         * значения.
         *
         * Ваша задача - реализовать эти предикаты и использовать их для фильтрации списка
         * людей по заданным условиям.
         */

        Predicate<Person> isAdult = person -> person.getAge() >= 18;
        Predicate<Person> isTeenager = person -> (person.getAge() > 13 && person.getAge() < 20);
        int AGE_LIMIT = 40;
        Predicate<Person> isOlderThan = person -> person.getAge() > AGE_LIMIT;
        Predicate<Person> isYoungerThan = person -> person.getAge() < AGE_LIMIT;

        Supplier<Person> personCreater = () -> new Person("Mad Max", 50);
        Person person = personCreater.get();

        Consumer<Person> personPrinter = p -> System.out.println(p.getName());
        personPrinter.accept(person);

        List<Person> list = List.of(
                new Person("Max", 14),
                new Person("Alex", 23),
                new Person("Dad", 50)
        );

        List<Person> list1 = list.stream()
                .filter(isYoungerThan)
                .toList();

        System.out.println(list1);

    }
}
