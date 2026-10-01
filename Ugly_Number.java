// LeetCode 263. Ugly Number
// Complexity
// Time: O(log n)
// Space: O(1)

public class Ugly_Number {
    public static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUgly(n));
    }
}
