// LeetCode 487. Max Consecutive Ones 2
// In this problem we have given an binary array 
// we have to find out the max consecutive ones with changing the 'one' zero into one  

public class Max_Consecutive_Ones_2 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int ans = 0;
        int window = 0;
        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            while (!(window == right - left + 1 || window == right - left)) {
                window -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0};
        System.err.println(findMaxConsecutiveOnes(arr));
    }
}
