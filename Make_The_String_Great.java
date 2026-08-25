// LeetCode 1544. Make The String Great
// Complexity
// Time: O(n)
// // Space: O(n)

import java.util.Stack;

public class Make_The_String_Great {
    public static String makeGood(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                
                stack.pop();

            } else {

                stack.push(ch);

            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
