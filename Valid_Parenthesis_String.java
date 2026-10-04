// LeetCode 678. Valid Parenthesis String
// Complexity
// Time: O(n)
// Space: O(1)

public class Valid_Parenthesis_String {
    public static boolean checkValidString(String s) {
        
        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low = Math.max(0, low - 1);
                high--;
            } else {
                low = Math.max(0, low - 1);
                high++;
            }

            if (high < 0) {
                return false;
            }
        }

        return low == 0;
    }

    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
}
