// LeetCode 724. Find Pivot Index
// Complexity
// Time  O(n)
// Space  O(1)

public class Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            rightSum -= val;
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += val;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.err.println(pivotIndex(arr));
    }
}
