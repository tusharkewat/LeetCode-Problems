// LeetCode 90. Subsets II
// Complexity
// Time:  O(n * 2^n)
// Space: O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> resultList = new ArrayList<>();

        Arrays.sort(nums);

        backtrack (resultList, new ArrayList<>(), nums, 0);

        return resultList;
    }

    private static void backtrack (List<List<Integer>> resultSet, 
                                List<Integer> tempSet,
                            int[] nums, int start) {

        
        if (resultSet.contains(tempSet)) 
            return ;
        
        resultSet.add(new ArrayList<>(tempSet));

        for (int i = start; i < nums.length; i++) {

            // Case of including the number
            tempSet.add(nums[i]);

            // Backtrack new subset
            backtrack(resultSet, tempSet, nums, i + 1);

            // Case of not including the number
            tempSet.remove(tempSet.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
