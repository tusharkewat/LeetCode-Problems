// LeetCode 131. Palindrome Partitioning
// Complexity
// Time:  O(n × 2^n)
// Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        backtrack(s, 0, current, result);

        return result;
    }

    private static void backtrack(String s, int start,
            List<String> current,
            List<List<String>> result) {
        
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return ;
        }

        for (int i = start; i < s.length(); i++) {

            String part = s.substring(start, i + 1);

            if (!palindrome(part)) {
                continue;
            }

            current.add(part);

            backtrack(s, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    private static boolean palindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
