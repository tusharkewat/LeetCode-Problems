// LeetCode 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.Arrays;

public class Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings {
    public static int[] maxDepthAfterSplit(String seq) {
        int[] answer = new int[seq.length()];
        int depth = 0;

        for (int i = 0; i < seq.length(); i++) {

            if (seq.charAt(i) == '(') {
                depth++;
                answer[i] = depth % 2;
            } 
            else {
                answer[i] = depth % 2;
                depth--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String seq = "(()())";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq)));
    }
}
