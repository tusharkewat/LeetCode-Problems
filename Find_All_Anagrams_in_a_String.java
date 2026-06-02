// LeetCode 438. Find All Anagrams in a String
// Complexity
// Time 	O(n)
// Space	O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;

            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(pCount, window)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}
