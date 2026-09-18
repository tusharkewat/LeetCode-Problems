// LeetCode 1520. Maximum Number of Non-Overlapping Substrings
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.*;

public class Maximum_Number_of_Non_Overlapping_Substrings {
    public static List<String> maxNumOfSubstrings(String s) {

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);

        for (int i = 0; i < n; i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            }

            last[index] = i;
        }

        List<int[]> intervals = new ArrayList<>();

        for (int c = 0; c < 26; c++) {

            if (first[c] == -1) {
                continue;
            }

            int start = first[c];
            int end = last[c];

            boolean valid = true;

            for (int i = start; i <= end; i++) {

                int current = s.charAt(i) - 'a';

                if (first[current] < start) {
                    valid = false;
                    break;
                }

                end = Math.max(end, last[current]);
            }

            if (valid) {
                intervals.add(new int[] { start, end });
            }
        }

        intervals.sort((a, b) -> a[1] - b[1]);

        List<String> result = new ArrayList<>();

        int previousEnd = -1;

        for (int[] interval : intervals) {

            int start = interval[0];
            int end = interval[1];

            if (start > previousEnd) {

                result.add(s.substring(start, end + 1));

                previousEnd = end;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "adefaddaccc";
        System.out.println(maxNumOfSubstrings(s));
    }
}
