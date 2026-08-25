// LeetCode 394. Decode String
// Complexity
// Time: O(n)
// // Space: O(n)

import java.util.Stack;

public class Decode_String {
    public static String decodeString(String s) {
        
        Stack <Integer> integerStack = new Stack<>();
        Stack <String> stringStack = new Stack<>();

        int number = 0;
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '[') {
                integerStack.push(number);
                stringStack.push(current.toString());

                number = 0;
                current.setLength(0);
            }

            else if (ch == ']') {
                int count = integerStack.pop();

                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < count; i++) {
                    temp.append(current);
                }

                current = temp;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
}
