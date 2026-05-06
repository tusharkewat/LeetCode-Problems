// LeetCode 696. Count Binary Substrings
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Count_Binary_Substrings {
    public int countBinarySubstrings(String s) {
        int prevGroup = 0;
        int currGroup = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {

                count += Math.min(prevGroup, currGroup);

                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        count += Math.min(prevGroup, currGroup);

        return count;
    }
}
