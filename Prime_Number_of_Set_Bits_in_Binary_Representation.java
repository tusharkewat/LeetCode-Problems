// LeetCode 762. Prime Number of Set Bits in Binary Representation
// Complexity
// Time: O((right-left+1) √ log right)
// Space: O(1)

public class Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);

            if (isPrime(setBits)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int left = 10, right = 15;
        System.out.println(countPrimeSetBits(left, right));
    }
}
