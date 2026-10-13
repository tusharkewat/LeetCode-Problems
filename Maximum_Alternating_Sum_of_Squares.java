// LeetCode 3727. Maximum Alternating Sum of Squares
// Complexity
// Time: O(n log n)
// Space: O(n)

import java.util.Arrays;

class Maximum_Alternating_Sum_of_Squares {
    public static long maxAlternatingSum(int[] nums) {
        
        int n = nums.length;
        long squares[] = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long answer = 0;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            answer -= squares[i];
        }

        for (int i = mid; i < n; i++) {
            answer += squares[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {1,-1,2,-2,3,-3};
        System.out.println(maxAlternatingSum(nums));
    }
}
