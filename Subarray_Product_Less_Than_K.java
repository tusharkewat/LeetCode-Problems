// LeetCode 713. Subarray Product Less Than K
// Using sliding Window
// Complexity
// Time:  O(n)
// Space:  O(1)

public class Subarray_Product_Less_Than_K {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,2,6}, k = 100;
        System.err.println(numSubarrayProductLessThanK(arr, k));
    }
}
