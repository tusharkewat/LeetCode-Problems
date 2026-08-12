// LeetCode 2958. Length of Longest Subarray With at Most K Frequency
// Complexity
// Time: O(n)   
// Space: O(n) 

import java.util.HashMap;

public class Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    public static int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            int num = nums[right];

            freq.put(num, freq.getOrDefault(num, 0) + 1);

            while (freq.get(num) > k) {

                int leftNum = nums[left];

                freq.put(leftNum, freq.get(leftNum) - 1);

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3,1,2}, k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
}
