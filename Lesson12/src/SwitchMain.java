public class SwitchMain {
    public static void main(String[] args) {

        strTest();
        String str1 = "HelloWorld";
        String temp = "World";

        String str2 = "Hello" + "World";
        String str3 = "Hello" + temp;
        String str4 = new String("HelloWorld");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

    }

    public static void strTest() {
        String str1 = "ABC";
        String str2 = new String("ABC");
        String str3 = "abc";

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); //true

        String str4 = str1 + str3; //  Здесть
        String str5 = "ABCabc";
        System.out.println(str4 == str5);
    }

    public static void switchTest() {
        int d = 4;
        switch (d) {
            case 1:
                System.out.println("One");
                break;
            case 2:

            case 4:
                System.out.println("Four");
                d = 1;
            case 5:
                System.out.println("Five");
        }

        System.out.println("----------");
    }
}
