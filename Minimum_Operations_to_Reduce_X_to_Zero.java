// LeetCode 1658. Minimum Operations to Reduce X to Zero
// Complexity
// Time:  O(n)
// Space: O(1)

public class Minimum_Operations_to_Reduce_X_to_Zero {
    public static int minOperations(int[] nums, int x) {
        
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        if (target < 0) {
            return -1;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (left <= right && sum > target) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        if (maxLength == -1) {
            return -1;
        }

        return nums.length - maxLength;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,4,2,3}, x = 5;
        System.out.println(minOperations(nums, x));
    }
}
