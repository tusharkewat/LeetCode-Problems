// LeetCode 3871. Count Commas in Range II
// Complexity
// Time:  O(log₁₀₀₀ n)
// Space: O(1)

public class Count_Commas_in_Range_II {
    public static long countCommas(long n) {
        
        long answer = 0;

        for (long x = 1000; x <= n; x *= 1000) {
            answer += n - x + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 1000000000000000L;
        System.out.println(countCommas(n));
    }
}
