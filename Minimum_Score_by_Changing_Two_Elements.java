// LeetCode 2567. Minimum Score by Changing Two Elements
// Complexity
// Time: O(n log n)
// Space: O(log n)

import java.util.Arrays;

public class Minimum_Score_by_Changing_Two_Elements {
    public static int minimizeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int ans = Math.min(nums[n - 1] - nums[2],
                Math.min(nums[n - 2] - nums[1],
                        nums[n - 3] - nums[0]));

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 7, 8, 5};
        System.out.println(minimizeSum(nums));
    }
}
