public class Main {
    /**
     * https://leetcode.com/problems/remove-element
     */
    public static void main(String[] args) {
        //removeElement2(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println("reverseBits = " + reverseBits(43261596));
    }

    // abc -> cba
    public static int reverseBits(int n) {
        String binaryString = Integer.reverse().toBinaryString(n);
        StringBuilder builder = new StringBuilder(binaryString);
        builder.reverse();
        return Integer.parseInt(builder.toString(), 2);
    }

    /**
     * Example 1:
     *
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Example 2:
     *
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * [3,3,2,2,3]
     */
    public static int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
//[0,1,4,0,3]
    public static int removeElement2(int[] nums, int val) {
        int k = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                if(nums[right] == val) {
                    right--;
                    continue;
                }
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}