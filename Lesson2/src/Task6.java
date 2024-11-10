public class Task6 {
    public static void main(String[] arg) {
        /**
         * Задание 5
         * Вывести на экран таблицу умножения 10х10 используя цикл while.
         * Числа разделить пробелом
         */

        boolean isNeedCalculate = true;
        int i = 11;

        while (i < 100) {
            int firstNum = i / 10;
            int secondNum = i % 10;
            System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            i++;
        }
    }
}
