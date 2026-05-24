// LeetCode 771. Jewels and Stones
// Complexity	
// Time 	O(n + m)
// Space	O(1)

import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        for (char c : stones.toCharArray()) {

            if (set.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
