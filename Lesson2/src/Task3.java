import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {

        /**
         * Задача 3:
         * За каждый месяц банк начисляет к сумме вклада 7% от суммы.
         * Напишите консольную программу, в которую пользователь вводит
         * сумму вклада и количество месяцев. А банк вычисляет конечную
         * сумму вклада с учетом начисления процентов за каждый месяц.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double deposit = scanner.nextInt();

        System.out.println("Введите кол-во месяцев");
        int countMonth = scanner.nextInt();

        double percent = 1.07;
        //double value = deposit * Math.pow(1.07,  countMonth);

        for (int i = 0; i < countMonth; i++) {
            deposit *= percent;
        }

        System.out.println("value = " + deposit);
    }
}
