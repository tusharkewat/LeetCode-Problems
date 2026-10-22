// LeetCode 342. Power of Four
// Complexity
// Space: O(1)

public class Power_of_Four {

    // Time: O(1)

    public static boolean isPowerOfFour1(int n) {
        return n > 0
            && (n & (n - 1)) == 0
            && (n - 1) % 3 == 0;
    }

    // Time: O(log n)

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}
