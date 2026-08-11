// LeetCode 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
// Complexity
// Time: O(n)   
// Space: O(n) 

import java.util.HashSet;

public class Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public static int missingInteger(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        int answer = sum;

        while (set.contains(answer)) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,2,5};
        System.out.println(missingInteger(nums));
    }
}
