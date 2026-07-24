// LeetCode 503. Next Greater Element II
// Complexity
// Time  O(n)
// Space  O(n)

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {
    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            if (i < n) {
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[i % n]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
