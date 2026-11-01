// LeetCode 453. Minimum Moves to Equal Array Elements
// Complexity
// Time: O(n)
// Space: O(1)

public class Minimum_Moves_to_Equal_Array_Elements {
    public static int minMoves(int[] nums) {
        
        int min = nums[0];

        for (int num : nums) {
            min = Math.min(num, min);
        }

        int moves = 0;

        for (int num : nums) {
            moves += num - min;
        }

        return moves;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(minMoves(nums));
    }
}
