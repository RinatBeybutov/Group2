public class Main {
    public static void main(String[] arg) {

        // Примитивные типы
        int a = 10;
        double b = 3.14;
        boolean c = true;

        // Ссылочные тип
        String d = "Hello";

        // Массивы
        int[] e = new int[10];

        // Классы = Объекты
        String string = new String("Hello");

        // Класс = данные + методы

        Person max = new Person("Иванов", 14);
        // Метод, который изменяет внутренние данные класса
        max.increaseClass();
        // Метод, который изменяет внутрюннюю переменную класса на ту,
        // которую мы передали в метод
        max.setSchoolClass(10);

        // создание кота
        Cat barsik = new Cat("Barsik");
        barsik.getName();

        System.out.println("max.getCat() = " + max.getCat());

        Person alex = new Person("Alex", 15, barsik);

        System.out.println("alex.getCat() = " + alex.getCat());


    }
}
