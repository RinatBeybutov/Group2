public class Task4 {
    public static void main(String[] arg) {

        int numInt = 1000;
        byte byteNum = (byte) numInt;
        System.out.println("byteNum = " + byteNum);

        int maxValue = Integer.MAX_VALUE + 1;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue == minValue);

    }
}
