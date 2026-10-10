// LeetCode 2333. Minimum Sum of Squared Difference
// Complexity
// Time: O(n log D), where D is the maximum absolute difference.
// Space: O(n)
 
public class Minimum_Sum_of_Squared_Difference {
    public static long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long totalDiff = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            totalDiff += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        long k = (long) k1 + k2;

        if (totalDiff <= k) {
            return 0;
        }

        int left = 0;
        int right = maxDiff;

        while (left < right) {
            int mid = left + (right - left) / 2;

            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int limit = left;

        for (int i = 0; i < n; i++) {
            if (diff[i] > limit) {
                k -= diff[i] - limit;
                diff[i] = limit;
            }
        }

        for (int i = 0; i < n && k > 0; i++) {
            if (diff[i] == limit && diff[i] > 0) {
                diff[i]--;
                k--;
            }
        }

        long answer = 0;

        for (int d : diff) {
            answer += (long) d * d;
        }

        return answer;
    }

    public static void main(String[] args) {
        int num1[] = {1,4,10,12}, num2[]  = {5,8,6,9};
        System.out.println(minSumSquareDiff(num1, num2, 1, 1));
    }
}
