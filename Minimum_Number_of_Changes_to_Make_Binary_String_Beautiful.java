// LeetCode 2914. Minimum Number of Changes to Make Binary String Beautiful
// Complexity
// Time: O(n)
// Space: O(1)

public class Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful {
    public static int minChanges(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "1001";
        System.out.println(minChanges(s));
    }
}
