// LeetCode 392. Is Subsequence
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
