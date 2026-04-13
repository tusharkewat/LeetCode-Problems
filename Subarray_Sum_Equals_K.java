// LeetCode 560. Subarray Sum Equals K
// Complexity
// Time  O(n)
// Space  O(n)

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3}, k = 3;
        System.err.println(subarraySum(arr, k));
    }
}
