// LeetCode 448. Find All Numbers Disappeared in an Array
// Time Complexity   O(n)

import java.util.ArrayList;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // Using Marking Negative
        // Space Complexity   O(1) 
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;


        // Using Hash Set Approach
        // Space Complexity O(n)

        // Set<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     set.add(num);
        // }

        // List<Integer> result = new ArrayList<>();
        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         result.add(i);
        //     }
        // }

        // return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr));
    }
}
