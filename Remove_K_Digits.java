// LeetCode 402. Remove K Digits
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.Stack;

public class Remove_K_Digits {
    public static String removeKdigits(String num, int k) {
        
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty() 
                && k > 0
                && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }
        
        // when k is still remaining
        // so removing from the end

        while (k > 0) {

            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        for (char digit : stack) {
            ans.append(digit);
        }

        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        ans = new StringBuilder(ans.substring(i));

        if (ans.length() == 0) {
            return "0";
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String num = "1234567";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }
}
