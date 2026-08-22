// LeetCode 3622. Check Divisibility by Digit Sum and Product
// Complexity
// Time: O(n)
// // Space: O(1)

public class Check_Divisibility_by_Digit_Sum_nd_Product {
    public static boolean checkDivisibility(int n) {

        int digitSum = 0;
        int digitProduct = 1;

        int originalNum = n;

        while (n > 0) {
            int digit = n % 10;

            digitSum += digit;

            digitProduct *= digit;

            n /= 10;
        }

        int totalSum = digitSum + digitProduct;

        if (originalNum % totalSum == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 99;
        System.out.println(checkDivisibility(n));
    }
}
