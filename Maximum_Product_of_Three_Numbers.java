// LeetCode 628. Maximum Product of Three Numbers
// Complexity
// Time  O(n)
// Space  O(1)

// import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {

        // Arrays.sort(nums);

        // int n = nums.length;

        // int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // int option2 = nums[0] * nums[1] * nums[n - 1];

        // return Math.max(option1, option2);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3,
                min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int n[] = { -10, -10, 1, 3, 2 };
        System.out.println(maximumProduct(n));
    }
}
