// LeetCode 3903. Smallest Stable Index I
// Complexity
// Time: O(n)
// Space: O(1) 

public class Smallest_Stable_Index_I {
    public static int firstStableIndex(int[] nums, int k) {
        
        int n = nums.length;

        int suffixMin[] = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            
            suffixMin[i] = Math.min(suffixMin[i], suffixMin[i + 1]);
        }

        int prefixMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            prefixMax = Math.max(prefixMax, nums[i]);

            int instability =  prefixMax - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {5,0,1,4}, k = 3;
        System.out.println(firstStableIndex(nums, k));
    }
}
