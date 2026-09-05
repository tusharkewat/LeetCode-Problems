// LeetCode 3904. Smallest Stable Index II
// Complexity
// Time: O(n)
// Space: O(1) 

public class Smallest_Stable_Index_II {
    public static  int firstStableIndex(int[] nums, int k) {
        
        int n = nums.length;

        int suffixMin[] = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = 0;

        for (int i = 0; i < n; i++) {

            prefixMax = Math.max(prefixMax, nums[i]);

            if (prefixMax - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {5,5}, k = 2;
        System.out.println(firstStableIndex(nums, k));
    }
}
