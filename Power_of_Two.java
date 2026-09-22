// LeetCode 231. Power of Two
// Complexity
// Time:  O(1)
// Space: O(1)

public class Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
}
