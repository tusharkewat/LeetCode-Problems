// LeetCode 912. Sort an Array
// Complexity
// Time:  O(n log n)
// Space: O(n)

import java.util.Arrays;

public class Sort_an_Array {
    public static int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort (int[] nums, int left, int right) {

        if (left >= right) 
            return ;

        int mid = left + (right - left) / 2;

        // sort left half
        mergeSort(nums, left, mid);

        // sort right half
        mergeSort(nums, mid + 1, right);

        // merge both the halves
        merge(nums, left, mid, right);

    }

    public static void merge (int[] nums, int left, int mid, int right) {

        int temp[] = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining from first half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Remaining from second half
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // copy to the original one
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
