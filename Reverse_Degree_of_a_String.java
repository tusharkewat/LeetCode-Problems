// LeetCode 3498. Reverse Degree of a String
// Complexity
// Time: O(n)
// Space: O(1)

public class Reverse_Degree_of_a_String {
    public static int reverseDegree(String s) {
        
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int normalPostion = ch - 'a' + 1;

            int reversePostion = 27 - normalPostion;

            int postionInString = i + 1;

            answer += reversePostion * postionInString;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }
}
