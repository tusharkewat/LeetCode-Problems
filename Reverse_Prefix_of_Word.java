// LeetCode 2000. Reverse Prefix of Word
// Complexity
// Time: O(n)
// // Space: O(n)

import java.util.Stack;

public class Reverse_Prefix_of_Word {
    public static String reversePrefix(String word, char ch) {
        
        int firstOccurence = word.indexOf(ch);
        if (firstOccurence == -1)
            return word;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= firstOccurence; i++) 
            stack.push(word.charAt(i));

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) 
            result.append(stack.pop());

        for (int i = firstOccurence + 1; i < word.length(); i++) 
            result.append(word.charAt(i));

        return result.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        System.out.println(reversePrefix(word, 'd'));
    }
}
