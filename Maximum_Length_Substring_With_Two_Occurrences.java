// LeetCode 3090. Maximum Length Substring With Two Occurrences
// Complexity
// Time: O(n)
// Space: O(1)

public class Maximum_Length_Substring_With_Two_Occurrences {
    public static int maximumLengthSubstring(String s) {

        int[] freq = new int[26];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'a';

            freq[index]++;

            while (freq[index] > 2) {

                int leftIndex = s.charAt(left) - 'a';

                freq[leftIndex]--;

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
}
