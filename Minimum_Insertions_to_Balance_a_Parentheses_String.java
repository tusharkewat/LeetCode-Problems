// LeetCode 541. Minimum Insertions to Balance a Parentheses String
// Complexity
// Time: O(n)
// Space: O(1)

public class Minimum_Insertions_to_Balance_a_Parentheses_String {
    public static int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {

                    insertions++;
                }

                if (open > 0) {
                    open--;
                } else {

                    insertions++;
                }
            }
        }

        insertions += open * 2;

        return insertions;
    }

    public static void main(String[] args) {
        String s = "))())(";
        System.out.println(minInsertions(s));
    }
}
