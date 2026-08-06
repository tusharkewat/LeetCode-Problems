// LeetCode 3345. Smallest Divisible Digit Product I
// Complexity
// Time: O(k * d)   
// Space: O(1) 

public class Smallest_Divisible_Digit_Product_I {
    public static int smallestNumber(int n, int t) {

        while (true) {

            if (digitProduct(n) % t == 0)
                return n;

            n++;
        }
    }

    private static int digitProduct(int num) {

        int product = 1;

        while (num > 0) {

            product *= (num % 10);

            num /= 10;
        }

        return product;
    }


    public static void main(String[] args) {
        int n = 23, t = 5;
        System.out.println(smallestNumber(n, t));
    }
}
