// LeetCode 3550. Smallest Index With Digit Sum Equal to Index
// Complexity
// Time:  O(n × d)
// Space: O(1)

public class Smallest_Index_With_Digit_Sum_Equal_to_Index {
    public static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digitSum = 0;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            if (digitSum == i) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2};
        System.out.println(smallestIndex(nums));
    }
}
