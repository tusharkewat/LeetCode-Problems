// LeetCode 40. Combination Sum II
// Complexity
// Time:  O(2^n × n)
// Space: O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(candidates, target, 0, current, result);

        return result;
    }

    private static void backtrack (
        int[] candidates, 
        int target, 
        int start,
        List<Integer> current,
        List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return ;
        }

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            // choose
            current.add(candidates[i]);

            // Explore 
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Undo choice
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {10,1,2,7,6,1,5}, target = 8;
        System.out.println(combinationSum2(nums, target));
    }
}
