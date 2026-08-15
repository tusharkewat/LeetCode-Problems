// LeetCode 3702. Longest Subsequence With Non-Zero Bitwise XOR
// Complexity
// Time: O(n)
// Space: O(1)

public class Longest_Subsequence_With_Non_Zero_Bitwise_XOR {
    public static int longestSubsequence(int[] nums) {

        int xor = 0;
        int countZero = 0;

        int n = nums.length;

        for (int num : nums) {

            xor ^= num;

            if (num == 0) {
                countZero++;
            }
        }

        if (xor != 0) {
            return n;
        }

        if (countZero == n) {
            return 0;
        }

        return n - 1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(longestSubsequence(nums));
    }
}
