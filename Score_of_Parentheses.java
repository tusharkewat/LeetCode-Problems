// LeetCode 856. Score of Parentheses
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.Stack;

public class Score_of_Parentheses {
    public static int scoreOfParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                
                stack.push(0);
            } else {

                int inner = stack.pop();
                int score;

                if (inner == 0) {
                    score = 1;
                } else {
                    score = 2 * inner;
                }

                stack.push(stack.pop() + score);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }
}
