// LeetCode 728. Self Dividing Numbers
// Complexity
// Time: O((right - left + 1) log right)
// Space: O(k)

import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            int num = i;
            boolean isDivide = true;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 0 || i % digit != 0) {
                    isDivide = false;
                    break;
                }

                num /= 10;
            }

            if (isDivide) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
