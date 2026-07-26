// LeetCode 628. Maximum Product of Three Numbers
// Complexity
// Time  O(n)
// Space  O(1)

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;

        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);        
    } 

    public static void main(String[] args) {
        int n[] = {-10,-10,1,3,2};
        System.out.println(maximumProduct(n));
    }
}
