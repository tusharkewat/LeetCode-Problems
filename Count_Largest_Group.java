// LeetCode 1399. Count Largest Group
// Complexity
// Time: O(n log n)
// Space: O(1)

public class Count_Largest_Group {
    public static int countLargestGroup(int n) {

        int[] freq = new int[37];

        // Calculate digit sum and count groups
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            freq[sum]++;
        }

        int max = 0;

        // Find largest group size
        for (int count : freq) {
            max = Math.max(max, count);
        }

        int result = 0;

        // Count groups having maximum size
        for (int count : freq) {
            if (count == max) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }
}
