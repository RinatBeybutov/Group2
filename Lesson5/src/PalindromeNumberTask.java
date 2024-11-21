public class PalindromeNumberTask {
    public static void main(String[] args) {

        /**
         * https://leetcode.com/problems/palindrome-number/description/
         */

        // abccba - палиндром
        // abcd -> dcba - не палиндром

        System.out.println("isPalindrome(121) = " + isPalindromeV2(121));

        System.out.println("isPalindrome(123) = " + isPalindromeV2(1234));

        System.out.println("isPalindrome(-121) = " + isPalindromeV2(-121));

    }

    public static boolean isPalindromeV1(int x) {
        char[] symbols = String.valueOf(x).toCharArray();
        for (int i = 0; i < symbols.length / 2; i++) {
            if(symbols[i] != symbols[symbols.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeV2(int x) {
        int originalX = x;
        int reversedX = 0;

        while (x > 0) {
            int rightDigit = x % 10;
            reversedX = reversedX * 10 + rightDigit;
            x /= 10;
        }

        return reversedX == originalX;
    }
}
