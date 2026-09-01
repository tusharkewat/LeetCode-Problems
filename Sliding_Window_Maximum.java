// LeetCode 239. Sliding Window Maximum
// Complexity
// Time O(n)
// Space O(k)

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Sliding_Window_Maximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        int ans[] = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // Remove element that is outside the window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove the smaller elements from last
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {

                deque.pollLast();
            }

            // Add the current elements index
            deque.offerLast(i);

            // Storing answer when window size equals k
            if (i >= k - 1) {

                ans[resultIndex] = nums[deque.peekFirst()];
                resultIndex++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7}, k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
