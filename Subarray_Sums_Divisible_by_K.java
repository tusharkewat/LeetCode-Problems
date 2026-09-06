// LeetCode 974. Subarray Sums Divisible by K
// Complexity
// Time: O(n)
// Space: O(n) 

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K {
    public static int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(remainder,
                    map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1}, k = 5;
        System.out.print(subarraysDivByK(nums, k));
    }
}
