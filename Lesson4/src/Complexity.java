import java.util.Arrays;

public class Complexity {
    public static void main(String[] arg) {

        // Константная сложность
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int first = getFirstFromArray(array);

        // Линейная сложность
        int sum = getSum(array);
        System.out.println("sum = " + sum);

        // Квадратичная сложность
        printMatches(new int[]{1,2,3,4});

    }

    // Константная сложность - O(1)
    public static int getFirstFromArray(int[] arr) {
        return arr[0];
    }

    // Линейная сложность - O(n)
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Квадратичная сложность - O(n^2)
    public static void printMatches(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(String.format("Команда %d играет с командой %d", arr[i], arr[j]));
            }
        }
    }

    // Логарифмическая сложность - O(log n)
    public static int binarySearch(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);
    }
}
