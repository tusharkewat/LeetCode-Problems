// 2778. Sum of Squares of Special Elements
// Complexity
// Time: O(n)
// Space: O(1)

public class Sum_of_Squares_of_Special_Elements {
    public static int sumOfSquares(int[] nums) {
        
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (n % (i + 1) == 0) {
 
                sum += nums[i] * nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(sumOfSquares(nums));
    }
}
