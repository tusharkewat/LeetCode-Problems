// LeetCode 3016. Minimum Number of Pushes to Type Word II
// Complexity
// Time  O(n)
// Space  O(1)

import java.util.Arrays;

public class Minimum_Number_of_Pushes_to_Type_Word_II {
    public static int minimumPushes(String word) {
        
        int freq[] = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int ans = 0;
        int index = 0;

        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) 
                break;

            ans += freq[i] * ((index / 8) + 1);

            index++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(word));
    }
}
