// LeetCode 1614. Maximum Nesting Depth of the Parentheses
// Complexity
// Time: O(n)
// Space: O(1)

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }

            else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
