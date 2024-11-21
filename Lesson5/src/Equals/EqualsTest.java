package Equals;

public class EqualsTest {
    public static void main(String[] args) {


        // Примитивы
        int a = 5;
        int b = 5;

        System.out.println("a == b = " + (a == b));

        // Исключение:
        // 0.3 == 0.3 ?
        // 0.3000002 = 0.30000001
        System.out.println("0.1 + 0.2 == 0.3 - " + (0.1 + 0.2 == 0.3));

        // Объекты

        Cat barsik = new Cat();
        Cat mursik = new Cat();

        System.out.println("barsik == mursik = " + (barsik == mursik));

        // Исключение:
        String first = "first";
        String second = "first";

        System.out.println("first == second = " + (first == second));

        // Строки
        String str1 = "ABC";
        String str2 = new String("ABC");
        String str3 = "abc";

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        String str4 = str1 + str3; //"ABCabc"
        String str5 = "ABCabc";
        System.out.println(str4 == str5); //false
    }
}
