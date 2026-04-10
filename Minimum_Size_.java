// LeetCode 209. Minimum Size Subarray Sum
// Complexity
// Time:  O(n)
// Space:  O(1)

public class Minimum_Size_ {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1}, target = 11;
        System.err.println(minSubArrayLen(target, arr));
    }
}
