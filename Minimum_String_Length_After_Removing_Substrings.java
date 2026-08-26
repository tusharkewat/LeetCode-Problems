// LeetCode 2696. Minimum String Length After Removing Substrings
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings {
    public static int minLength(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty()
                    && ((stack.peek() == 'A' && ch == 'B')
                            || stack.peek() == 'C' && ch == 'D')) {

                stack.pop();
            } else {

                stack.push(ch);
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
}
