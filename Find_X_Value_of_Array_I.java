// LeetCode 3524. Find X Value of Array I
// Complexity
// Time:  O(n × k)
// Space: O(k)

import java.util.Arrays;

public class Find_X_Value_of_Array_I {
    public static long[] resultArray(int[] nums, int k) {

        long[] answer = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] next = new long[k];

            // Start a new subarray with only nums[i]
            int remainder = num % k;
            next[remainder]++;

            // Extend all previous subarrays
            for (int r = 0; r < k; r++) {

                if (dp[r] == 0) {
                    continue;
                }

                int newRemainder = (int) ((long) r * num % k);

                next[newRemainder] += dp[r];
            }

            dp = next;

            // Add subarrays ending at current index
            for (int r = 0; r < k; r++) {
                answer[r] += dp[r];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5}, k = 3;
        System.out.println(Arrays.toString(resultArray(nums, k)));
    }
}
