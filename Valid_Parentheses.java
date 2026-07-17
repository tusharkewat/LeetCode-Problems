// LeetCode 20. Valid Parentheses
// Complexity
// Time  O(n)
// Space  O(n)

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') 
                stack.push(')');
            else if (c == '{') 
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
