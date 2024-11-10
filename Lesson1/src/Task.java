import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Объявляем сканнер
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести 4 числа
        System.out.println("Введите 4 числа");

        // Создаем массив из 4x элеиентов
        int[] arr = new int[4];

        // Заполняем массив числами из консоли
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        // Сортируем массив
        Arrays.sort(arr);

        // Выводим массив в консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
