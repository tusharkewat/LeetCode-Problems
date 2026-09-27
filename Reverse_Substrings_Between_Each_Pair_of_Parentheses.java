// LeetCode 1190. Reverse Substrings Between Each Pair of Parentheses
// Complexity
// Time: O(n²)
// Space: O(n)

import java.util.Stack;

public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {

    public static String reverseParentheses(String s) {

        Stack<StringBuilder> stack = new Stack<>();

        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                stack.push(current);

                current = new StringBuilder();

            } else if (ch == ')') {

                current.reverse();

                StringBuilder previous = stack.pop();

                previous.append(current);

                current = previous;

            } else {

                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
}
