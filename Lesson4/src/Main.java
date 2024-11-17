import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {

        /**
         * Когда используется final
         * 1. Ипользуем для примитива - нельзя изменить после инициализации
         * 2. Используем для объекта - нельзя изменить ссылку после инициализации
         * 3. Используем для класса - нельзя создать классы-наследники
         * 4. Используем для метода - нельзя переопределить в классах - наследниках
         */

        // <Тип класса> <Название переменной = ссылка> = new <Конструктор>
        final Cube cube = new Cube(15);
        cube.increaseCount();

        // Нельзя, тк ссылка на объект объявлена как final
        // cube = new Cube(10);
        cube.tryToChangeSide(5);

        final int count = 5;

        String s = "Hello" + " my" + " World " + count;
        String str1 = String.format("Hello my World %d", count);

        String name = "Hello, my name is " + "John" + ", and I am " + 18 + "years old";

        String str2 = String.format("Hello, my name is %s, and I am %d years old", "John", 18);

        String str3 = String.format("Hello, my name is %s, and I am from %s , city %s", "ALex", "USA", "New York");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        int[] arr = {4, 0, 2, -1, 4};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
