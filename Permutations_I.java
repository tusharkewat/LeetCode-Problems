// LeetCode 46. Permutations
// Complexity
// Time:  O(n × !n)
// Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class Permutations_I {
    public static List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        backtrack (result, new ArrayList<>(), nums);

        return result;
    }

    private static void backtrack (
        List<List<Integer>> result,
        List<Integer> tempList,
        int[] nums) {

        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return ;
        }

        for (int i : nums) {

            if (tempList.contains(i))
                continue;

            tempList.add(i);

            backtrack(result, tempList, nums);

            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
