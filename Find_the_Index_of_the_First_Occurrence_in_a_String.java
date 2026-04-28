// LeetCode 28. Find the Index of the First Occurrence in a String
// Complexity
// Time:  O(n * m)
// Space:  O(1)

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m)
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "code";
        System.out.println(strStr(haystack, needle));
    }
}
