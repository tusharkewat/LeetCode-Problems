// LeetCode 921. Minimum Add to Make Parentheses Valid
// Complexity
// Time: O(n)
// Space: O(1)

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static int minAddToMakeValid(String s) {
        
        int open = 0;
        int add = 0;

        for (char ch : s.toCharArray()) {
            
            if (ch == '(') {

                open++;

            } else {

                if (open > 0) {

                    open--;

                } else {

                    add++;
                }
            }
            
        }

        return open + add;
    }

    public static void main(String[] args) {
        String s = "(((";
        System.out.println(minAddToMakeValid(s));
    }
}
