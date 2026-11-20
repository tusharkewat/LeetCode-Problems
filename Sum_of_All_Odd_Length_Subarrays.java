// LeetCode 588. Sum of All Odd Length Subarrays
// Complexity
// Time: O(n²)
// Space: O(1)

public class Sum_of_All_Odd_Length_Subarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        
        int total = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                int length = j - i + 1;

                if (length % 2 != 0) {
                    total += sum;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
