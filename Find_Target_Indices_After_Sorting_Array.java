// LeetCode 2089. Find Target Indices After Sorting Array
// Complexity
// Approach     	        Time	    Extra space
// Sort + search	     O(n log n)	       O(n)
// Count without sorting	O(n)	       O(n)

import java.util.*;

public class Find_Target_Indices_After_Sorting_Array {
    // public List<Integer> targetIndices(int[] nums, int target) {
        
    //     List<Integer> answer = new ArrayList<>();

    //     Arrays.sort(nums);

    //     for (int i = 0; i < nums.length; i++) {

    //         if (nums[i] == target) {
    //             answer.add(i);
    //         }
    //     }

    //     return answer;
    // }


    public static List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0;
        int equal = 0;

        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                equal++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = smaller; i < smaller + equal; i++) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int num[] = {1,2,5,2,3};
        System.out.println(targetIndices(num, 2));
    }
}
