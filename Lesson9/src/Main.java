import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 2) Обработка некорректного ввода пользователя
         *
         * Напишите программу, которая запрашивает у пользователя ввод числа с консоли.
         * Используйте Scanner для чтения ввода с консоли.
         * Обработайте InputMismatchException, чтобы отлавливать случаи, когда введено не число.
         * В случае ошибки запрашивайте ввод заново, пока пользователь не введет корректное число.
         * После получения корректного числа умножьте его на 2 и выведите сообщение с результатом обратно в консоль.
         */

        boolean isNum = false;
        try (Scanner sc = new Scanner(System.in)) {
            while (!isNum) {
                try {
                    String s = sc.nextLine();
                    System.out.println(2 * Integer.parseInt(s));
                    //System.out.println(sc.nextInt() * 2);
                    isNum = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода. Введите число.");
                    //sc.next();
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}