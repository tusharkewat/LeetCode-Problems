// LeetCode 908. Smallest Range I
// Complexity
// Time: O(n)
// Space: O(1)

public class Smallest_Range_I {
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return Math.max(0, max - min - 2 * k);
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 6}, k = 3;
        System.out.println(smallestRangeI(nums, k));
    }
}
