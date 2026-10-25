// LeetCode 598. Range Addition II
// Complexity
// Time: O(k) 
// Space: O(1)

public class Range_Addition_II {
    public static int maxCount(int m, int n, int[][] ops) {
        int minA = m;
        int minB = n;

        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        return minA * minB;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int ops[][] = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};

        System.out.println(maxCount(m, n, ops));
    }
}
