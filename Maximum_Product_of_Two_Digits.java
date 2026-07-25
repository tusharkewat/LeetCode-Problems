// LeetCode 3536. Maximum Product of Two Digits
// Complexity
// Time  O(n)
// Space  O(1)

public class Maximum_Product_of_Two_Digits {
    public static int maxProduct(int n) {
        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }

            n = n / 10;
        }

        return largest * secondLargest;
    }
    public static void main(String[] args) {
        int n = 827;
        System.out.println(maxProduct(n));
    }
}
