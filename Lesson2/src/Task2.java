public class Task2 {
    public static void main(String[] arg) {

        /**
         * Задача 1:
         * Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы.
         * Сколько рублей лежит в каждой кассе?
         * Вывести на косоль
         */

        int money = 5;
        double cash1 =  money / 2.0; // int и double
        double cash2 = money - cash1;
        System.out.println("В первой кассе " + cash1 + " рублей");
        System.out.println("Во второй кассе " + cash2 + " рублей");
        System.out.println( cash1 == cash2); //true
        System.out.println((0.1 + 0.2) == 0.3);
        //.300000001 = 0.30000000

    }
}
