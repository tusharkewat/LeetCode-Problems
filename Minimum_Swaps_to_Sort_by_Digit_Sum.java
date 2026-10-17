// LeetCode 3551. Minimum Swaps to Sort by Digit Sum
// Complexity
// Time	O(n log n)
// Space	O(n)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Minimum_Swaps_to_Sort_by_Digit_Sum {
    public static int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] sorted = new Integer[n];

        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }

        // Sort by digit sum, then by value
        Arrays.sort(sorted, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a, b);
        });

        // Store each number's target index
        Map<Integer, Integer> target = new HashMap<>();

        for (int i = 0; i < n; i++) {
            target.put(sorted[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Find cycles
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                cycleSize++;

                j = target.get(nums[j]);
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }

    private static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {22,14,33,7};
        System.out.println(minSwaps(nums));
    }
}
