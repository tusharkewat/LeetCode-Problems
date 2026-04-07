// LeetCode 1004. Max Consecutive Ones 3
// Compexity 
// Time  O(n)
// Space  O(1)

public class Max_Consecutive_Ones_3 {
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        int window = 0;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            while (window + k < right - left + 1) {
                window -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, k = 3;
        System.err.println(longestOnes(arr, k));
    }
}
