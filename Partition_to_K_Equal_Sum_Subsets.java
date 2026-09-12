// LeetCode 698. Partition to K Equal Sum Subsets

import java.util.Arrays;

public class Partition_to_K_Equal_Sum_Subsets {
    public static boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % k != 0) {
            return false;
        }

        int target = sum / k;

        for (int num : nums) {
            if (num > target) {
                return false;
            }
        }

        Arrays.sort(nums);

        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int[] bucketSum = new int[k];

        return backtrack(nums, 0, bucketSum, target);
    }

    private static boolean backtrack(int[] nums, int index, int[] bucketSum, int target) {

        if (index == nums.length) {
            return true;
        }

        int num = nums[index];

        for (int i = 0; i < bucketSum.length; i++) {

            if (bucketSum[i] + num > target)
                continue;

            bucketSum[i] += num;

            if (backtrack(nums, index + 1, bucketSum, target)) {
                return true;
            }

            bucketSum[i] -= num;

            if (bucketSum[i] == 0) {
                break;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,3,5,2,1}, k = 4;
        System.out.println(canPartitionKSubsets(nums, k));
    }
}
