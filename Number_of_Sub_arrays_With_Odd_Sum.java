// LeetCode 1524. Number of Sub-arrays With Odd Sum
// Complexity
// Time: O(n)
// Space: O(1)

public class Number_of_Sub_arrays_With_Odd_Sum {
    public static int numOfSubarrays(int[] arr) {

        int MOD = 1000000007;

        int odd = 0;
        int even = 1;
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (sum % 2 == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }

            count %= MOD;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(numOfSubarrays(arr));
    }
}
