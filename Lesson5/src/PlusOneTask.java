import java.util.Arrays;

public class PlusOneTask {
    public static void main(String[] args) {

        /**
         * https://leetcode.com/problems/plus-one/
         */

        int[] result = plusOne(new int[]{9, 9, 9, 9});
        System.out.println(Arrays.toString(result));
    }

    /**
     * Input: digits = [1,2,3,9]
     * Output: [1,2,4,0]
     */
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        if (digits[0] > 9) {
            int[] increasedArray = new int[digits.length + 1];
            increasedArray[0] = 1;
            return increasedArray;
        }
        return digits;
    }
}
