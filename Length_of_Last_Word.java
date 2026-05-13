// LeetCode 58. Length of Last Word
// Complexity	
// Time	    O(n)
// Space	O(1)

public class Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int length = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(lengthOfLastWord(str));
    }
}
