// LeetCode 326. Power of Three
// Complexity
// Time: O(log_3 n)
// Space: O(1)

public class Power_of_Three {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}
