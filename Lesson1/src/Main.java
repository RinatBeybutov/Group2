import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,3,1,-2,10};

        Arrays.sort(arr);

        // 1 вариант печати массива
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");

        // 2 вариант печати массива
        for (int item : arr) {
            System.out.println(item);
        }

        System.out.println("-----------------");

        // 3 вариант печати массива
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Написать метод и реализовать в этом методе логику сортировки массива так, чтобы все значения
     * в массиве расположились от меньшего к большему. На вход метод должен принимать неотсортированный
     * массив с типом значений int.
     *
     * В методе main:
     *
     * Создать и инициализировать(заполнить значениями) массив с типом значений в нем int.
     * Вызвать написанный метод, передав в него в качесте параметра массив из пункта 1.
     * С помощью цикла for вывести в консоль значения отсортированного массива.
     */
}