// LeetCode 80. Remove Duplicates from Sorted Array II
// Complexity
// Time  O(n)
// Space  O(1)

public class Remove_Duplicates_from_Sorted_Array_2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,2,3,3};
        System.err.println(removeDuplicates(arr));
    }
}
