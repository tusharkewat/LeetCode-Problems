// LeetCode 462. Minimum Moves to Equal Array Elements II
// Complexity
// Time: O(n log n)
// Space: O(1)

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II {
    public static int minMoves2(int[] nums) {
        
        Arrays.sort(nums);

        int median = nums[nums.length / 2];
        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(minMoves2(nums));
    }
}
