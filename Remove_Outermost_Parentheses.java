// LeetCode 1021. Remove Outermost Parentheses

public class Remove_Outermost_Parentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {

                if (depth > 0) 
                    sb.append(ch);
                
                depth++;
            } else {
                depth--;
                
                if (depth > 0) 
                    sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
