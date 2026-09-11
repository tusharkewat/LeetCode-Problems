// LeetCode 3483. Unique 3-Digit Even Numbers
// Complexity
// Time:  O(n³)
// Space: O(m)    m is the number of unique 3 digit number

import java.util.HashSet;

public class Unique_3_Digit_Even_Numbers {
    public static int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0)
                continue;

            for (int j = 0; j < digits.length; j++) {

                if (i == j)
                    continue;

                for (int k = 0; k < digits.length; k++) {

                    if (i == k || j == k)
                        continue;

                    if (digits[k] % 2 != 0)
                        continue;

                    int number = digits[i] * 100 +
                            digits[j] * 10 +
                            digits[k];

                    set.add(number);
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(totalNumbers(nums));
    }
}
