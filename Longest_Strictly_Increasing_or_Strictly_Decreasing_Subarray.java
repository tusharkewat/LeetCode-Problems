// LeetCode 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
// Complexity
// Time: O(n)
// Space: O(1)

public class Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public static int longestMonotonicSubarray(int[] nums) {

        int inc = 1;
        int dec = 1;
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }

            ans = Math.max(ans, Math.max(inc, dec));
        }

        return ans;
    }

    public static void main(String[] args) {
        int []nums = {1, 2, 3, 4, 2, 1, 0};
        System.out.println(longestMonotonicSubarray(nums));
    }
}
