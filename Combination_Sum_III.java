// LeetCode 216. Combination Sum III
// Complexity
// Time:  O(C(9,k) × k)
// Space: O(k)

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(k, n, 1, result, current);

        return result;
    }

    private static void backtrack(int k, int target, int start, List<List<Integer>> result, List<Integer> current) {

        if (current.size() == k) {

            if (target == 0) {
                result.add(new ArrayList<>(current));
            }

            return;
        }

        for (int i = start; i <= 9; i++) {

            current.add(i);

            backtrack(k, target - i, i + 1, result, current);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3, n = 9;
        System.out.println(combinationSum3(k, n));
    }
}
