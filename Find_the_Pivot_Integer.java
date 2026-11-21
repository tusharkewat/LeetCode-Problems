// LeetCode 2485. Find the Pivot Integer
// Complexity
// Time: O(1)
// Space: O(1)

public class Find_the_Pivot_Integer {
    public static int pivotInteger(int n) {
        int total = n * (n + 1) / 2;

        int x = (int) Math.sqrt(total);

        if (x * x == total) {
            return x;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
}
