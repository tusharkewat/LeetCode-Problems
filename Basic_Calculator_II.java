// LeetCode 227. Basic Calculator II
// Complexity
// Time: O(n)
// // Space: O(n)

import java.util.Stack;

public class Basic_Calculator_II {
    public static int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();

        int number = 0;
        char operation = '+';

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                if (operation == '+') {
                    stack.push(number);
                } 

                else if (operation == '-') {
                    stack.push(-number);
                } 

                else if (operation == '*') {
                    stack.push(stack.pop() * number);
                }

                else if (operation == '/') {
                    stack.push(stack.pop() / number);
                }

                operation = ch;
                number = 0;
            }
        }

        int answer = 0;

        for (int num : stack) {
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "3+5 / 2 ";
        System.out.println(calculate(s));
    }
}
