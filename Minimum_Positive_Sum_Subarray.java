// LeetCode 3364. Minimum Positive Sum Subarray 
// Complexity
// Time: O(n * r)
// Space: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Positive_Sum_Subarray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums.get(j);

                int len = j - i + 1;

                if (len >= l && len <= r && sum > 0) {
                    ans = Math.min(ans, sum);
                }

                if (len >= r) {
                    break;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -2, 1, 4));
        int l = 2;
        int r = 3;

        System.out.println(minimumSumSubarray(nums, l, r));
    }
}
