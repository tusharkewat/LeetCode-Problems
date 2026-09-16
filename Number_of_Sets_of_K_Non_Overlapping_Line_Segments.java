// LeetCode 1621. Number of Sets of K Non-Overlapping Line Segments
// Complexity
// Time: O((n+k) × k)
// Space: O((n+k) × k)

public class Number_of_Sets_of_K_Non_Overlapping_Line_Segments {
    public static int numberOfSets(int n, int k) {

        int MOD = 1_000_000_007;

        int total = n + k - 1;
        int choose = 2 * k;

        long[][] dp = new long[total + 1][choose + 1];

        for (int i = 0; i <= total; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= Math.min(i, choose); j++) {

                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }

        return (int) dp[total][choose];
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(numberOfSets(n, k));
    }
}
