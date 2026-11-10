// LeetCode 3693. Climbing Stairs II
// Complexity
// Time: O(n)
// Space: O(n)

public class Climbing_Stairs_II {
    public static int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    dp[i] = Math.min(dp[i],
                            dp[i - j] + costs[i - 1] * j);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int[] costs = new int[] { 1, 2, 3, 4 };

        System.out.println(climbStairs(n, costs));
    }
}
