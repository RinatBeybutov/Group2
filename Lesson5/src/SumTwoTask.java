import java.util.HashMap;
import java.util.Map;

public class SumTwoTask {
    public static void main(String[] args) {

        /**
         * Задача с литкода: https://leetcode.com/problems/two-sum/description/
         */

        int[] result = twoSumShortWay(new int[]{11, 15, 2, 7}, 9);

        System.out.println(result[0] + " " + result[1]);

    }

    /**
     * {2, 7, 11, 15} -> {0, 1}
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    /**
     * {2, 7, 11, 15} -> {0, 1}
     */
    public static int[] twoSumShortWay(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (valueToIndex.containsKey(target - nums[i])) {
                return new int[]{i, valueToIndex.get(target - nums[i])};
            } else {
                valueToIndex.put(nums[i], i);
            }
        }
        return null;
    }
}
