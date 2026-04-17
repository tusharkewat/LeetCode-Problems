// LeetCode 189. Rotate Array
// Time complexity  O(n)

public class Rotate_Array {
    // Using extra space O(n)
    
    // public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // int[] temp = new int[n];

        // for (int i = 0; i < n; i++) {
        // temp[(i + k) % n] = nums[i];
        // }

        // for (int i = 0; i < n; i++) {
        // nums[i] = temp[i];
        // }
    // }


    // Without using extra space  O(1)

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
