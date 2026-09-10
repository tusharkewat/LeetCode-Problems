// LeetCode 77. Combinations
// Complexity
// Time:  O(k × C(n, k))
// Space: O(k × C(n, k))

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(n, k, 1, current, result);

        return result;
    }

    private static void backtrack(
            int n,
            int k,
            int start,
            List<Integer> current,
            List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {

            // Add number
            current.add(i);

            // Explore more
            backtrack(n, k, i + 1, current, result);

            // Remove choice
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n, k));
    }
}
