// LeetCode 3736. Minimum Moves to Equal Array Elements III
// Complexity
// Time: O(n)
// Space: O(1)

public class Minimum_Moves_to_Equal_Array_Elements_III {
    public static int minMoves(int[] nums) {
        
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int moves = 0;

        for (int num : nums) {
            moves += max - num;
        }

        return moves;
    }

    public static void main(String[] args) {
        int nums[] = {2,1,3};
        System.out.println(minMoves(nums));
    }
}
