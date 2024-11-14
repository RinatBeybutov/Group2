import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        /**
         * 1. Рекусрия доп задача
         * 2. ВОпрос с классами: типы данных (примитивы и объекты)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();

        System.out.println(fib(num));
        System.out.println("count = " + count);


    }

    public static int count = 0;
    public static int[] cache = new int[8];
    /**
     * 3) Напишите обычный и рекурсивный расчеты числа Фибоначчи по его порядковому номеру
     * (это дополнительное задание для тех, кто хочет самостоятельно попкартиковаться
     * в решении задач и чуть лучше понять рекурсию)
     *
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, …,
     */
    public static int fib(int num) {
        if(cache[num] != 0) {
            return cache[num];
        }

        System.out.println("Зашел с числом " + num);
        count++;

        if(num <= 1)  {
            cache[num] = num;
            return num;
        }

        int res = fib(num - 1) + fib(num - 2);
        cache[num] = res;

        return res;
    }
}