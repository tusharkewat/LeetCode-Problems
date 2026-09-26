// LeetCode 1807. Evaluate the Bracket Pairs of a String
// Complexity
// Time:  O(n + m)
// Space: O(m)

import java.util.HashMap;
import java.util.List;

public class Evaluate_the_Bracket_Pairs_of_a_String {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder answer = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) != '(') {
                answer.append(s.charAt(i));
                i++;
            }

            else {
                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }

                String key = s.substring(i + 1, j);

                if (map.containsKey(key)) {
                    answer.append(map.get(key));
                } else {
                    answer.append('?');
                }

                i = j + 1;
            }
        }

        return answer.toString();
    }
}
