public class Task2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        int sum = getSum(a,b);

        a = 4;
        b = 5;

        sum = getSum(a,b);
    }

    /**
     * Возвращает сумму двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public static int getSum(int a, int b) {
        return a + b;
    }
}
