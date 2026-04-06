// LeetCode 2461. Maximum Sum of Distinct Subarrays With Length K
// Using Sliding Window + HashMap
// Complexity
// Time  O(n)
// Space  O(k)

import java.util.HashMap;
import java.util.Map;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0, maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            sum += curr;

            if (right - left + 1 > k) {
                int leftVal = nums[left];
                map.put(leftVal, map.get(leftVal) - 1);
                if (map.get(leftVal) == 0) {
                    map.remove(leftVal);
                }
                sum -= leftVal;
                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,2,9,9,9}, k = 3;
        System.err.println(maximumSubarraySum(arr, k));
    }
}
