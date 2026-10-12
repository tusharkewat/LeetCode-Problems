// LeetCode 2897. Apply Operations on Array to Maximize Sum of Squares
// Complexity
// Time: O(n + k)
// Space: O(1)

import java.util.ArrayList;
import java.util.List;

public class Apply_Operations_on_Array_to_Maximize_Sum_of_Squares {
    public static int maxSum(List<Integer> nums, int k) {
        int[] bitCount = new int[31];

        // Step 1: Count set bits at each position
        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++) {
                if (((num >> bit) & 1) == 1) {
                    bitCount[bit]++;
                }
            }
        }

        // Step 2: Build k numbers greedily
        long sum = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < k; i++) {
            long current = 0;

            for (int bit = 0; bit < 31; bit++) {
                if (bitCount[bit] > 0) {
                    current |= (1L << bit);
                    bitCount[bit]--;
                }
            }

            sum = (sum + current * current) % mod;
        }

        return (int) sum;
    }

    public static void main(String[] args) {

        List<Integer> nums = new  ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        int k = 2;

        System.out.println(maxSum(nums, k));
    }
}
