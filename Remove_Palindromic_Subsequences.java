// LeetCode 1332. Remove Palindromic Subsequences
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Remove_Palindromic_Subsequences {
    public int removePalindromeSub(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }

            left++;
            right--;
        }

        return 1;
    }
}
