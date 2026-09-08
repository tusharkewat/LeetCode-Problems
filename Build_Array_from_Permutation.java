// LeetCode 1920. Build Array from Permutation
// Complexity
// Time:  O(n)
// Space: O(1)

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static int[] buildArray(int[] nums) {
        
        int n = nums.length;

        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {5,0,1,2,3,4};
        System.out.print(Arrays.toString(buildArray(nums)));
    }
}
