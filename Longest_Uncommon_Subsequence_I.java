// LeetCode 521. Longest Uncommon Subsequence I
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Longest_Uncommon_Subsequence_I {
    public static int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
    public static void main(String[] args) {
        String a = "aba", b = "cdc";
        System.out.println(findLUSlength(a, b));
    }
}
