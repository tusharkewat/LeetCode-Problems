// LeetCode 697. Degree of an Array
// Complexity
// Time: O(n)   
// Space: O(n) 

import java.util.HashMap;

public class Degree_of_an_Array {
    public static int findShortestSubArray(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);
        }

        int degree = 0;

        for (int count : freq.values()) {
            degree = Math.max(degree, count);
        }

        int ans = nums.length;

        for (int num : freq.keySet()) {

            if (freq.get(num) == degree) {

                int length = last.get(num) - first.get(num) + 1;

                ans = Math.min(ans, length);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
}
