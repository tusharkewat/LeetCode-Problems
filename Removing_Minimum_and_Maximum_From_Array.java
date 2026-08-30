// LeetCode 2091. Removing Minimum and Maximum From Array
// Complexity
// Time O(n)
// Space O(1)

public class Removing_Minimum_and_Maximum_From_Array {
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int removeFromLeft = right + 1;

        int removeFromRight = n - left;

        int removeBothSides = (left + 1) + (n - right);

        return Math.min(removeFromLeft, Math.min(removeFromRight, removeBothSides));
    }

    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
}
