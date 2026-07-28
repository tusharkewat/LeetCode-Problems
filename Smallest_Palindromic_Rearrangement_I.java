// LeetCode 3517. Smallest Palindromic Rearrangement I
// Complexity
// Time  O(n)
// Space  O(n)

public class Smallest_Palindromic_Rearrangement_I {
    public static String smallestPalindrome(String s) {
        
        int freq[] = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }

            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) ('a' + i));
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }

    public static void main(String[] args) {
        String s = "daccad";
        System.out.println(smallestPalindrome(s));
    }
}
