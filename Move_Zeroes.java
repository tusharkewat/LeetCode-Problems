// 283.  Move Zeroes
// Complexity	
// Time	 O(n)
// Space  O(1)

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }
        }
    }
}
