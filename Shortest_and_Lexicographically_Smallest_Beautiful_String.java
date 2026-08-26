// LeetCode 2904. Shortest and Lexicographically Smallest Beautiful String
// Complexity
// Time:  O(n²)
// Space: O(n)

public class Shortest_and_Lexicographically_Smallest_Beautiful_String {
    public static String shortestBeautifulSubstring(String s, int k) {
        
        int left = 0;
        int ones = 0;

        String answer = "";

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            while (ones > k) {

                if (s.charAt(left) == '1') {
                    ones--;
                }

                left++;
            }

            while (ones == k && s.charAt(left) == '0') {
                left++;
            }

            if (ones == k) {

                String current = s.substring(left, right + 1);

                if (answer.equals("") 
                        || current.length() < answer.length()
                        || (current.length() == answer.length()
                        && current.compareTo(answer) < 0)) {

                    answer = current;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;
        System.out.println(shortestBeautifulSubstring(s, k));
    }
}
