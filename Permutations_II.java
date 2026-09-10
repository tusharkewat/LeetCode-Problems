// LeetCode 47. Permutations II
// Complexity
// Time:  O(n × !n)
// Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class Permutations_II {
    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, result, current);

        return result;
    }

    private static void backtrack(int[] nums, boolean[] used,
            List<List<Integer>> result,
            List<Integer> current) {

        if (current.size() == nums.length &&
                !result.contains(current)) {

            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            current.add(nums[i]);
            used[i] = true;

            backtrack(nums, used, result, current);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(permuteUnique(nums));
    }
}
