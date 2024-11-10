import java.util.Scanner;

public class Task8 {
    public static void main(String[] arg) {

        /**
         * Ввести с клавиатуры два числа m и n.
         * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
         *
         * Пример: m=2, n=4
         * 8888
         * 8888
         */

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();// next integer
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("8");
            }
            System.out.println(); // Чтобы перейти на следующую строчку
            // здесь
        }

        //scanner.next(); // считать строку
        //scanner.nextLine(); // считать с переносом на след строку



    }
}
