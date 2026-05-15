// LeetCode 434. Number of Segments in a String
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Number_of_Segments_in_a_String {
    public static int countSegments(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' &&
                    (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "Hello, my name is John";
        System.out.println(countSegments(str));
    }
}
