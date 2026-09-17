// LeetCode 1477. Find Two Non-overlapping Sub-arrays Each With Target Sum
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.Arrays;

public class Find_Two_Non_overlapping_Sub_arrays_Each_With_Target_Sum {
    public static int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        int left = 0;
        int sum = 0;
        int answer = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {

                int currentLength = right - left + 1;

                if (left > 0 && dp[left] != Integer.MAX_VALUE) {
                    answer = Math.min(
                        answer,
                        currentLength + dp[left]
                    );
                }

                dp[right + 1] = Math.min(
                    dp[right],
                    currentLength
                );

            } else {
                dp[right + 1] = dp[right];
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,2,4,3}, t = 3;
        System.out.println(minSumOfLengths(arr, t));
    }
}
