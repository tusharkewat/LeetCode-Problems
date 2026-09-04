// LeetCode 451. Sort Characters By Frequency
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sort_Characters_By_Frequency {
    public static String frequencySort(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a,b) -> map.get(b) - map.get(a));

        StringBuilder answer = new StringBuilder();

        for (char ch : chars) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                answer.append(ch);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
