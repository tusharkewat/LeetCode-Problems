// LeetCode 1464. Maximum Product of Two Elements in an Array
// Complexity
// Time  O(n)
// Space  O(1)

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static int maxProduct(int[] nums) {

        int largest = 0;
        int secoundLargest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secoundLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secoundLargest) {
                secoundLargest = nums[i];
            }
        }

        return (largest - 1) * (secoundLargest - 1);
    }

    public static void main(String[] args) {
        int nums[] = {3,7};
        System.out.println(maxProduct(nums));
    }
}
