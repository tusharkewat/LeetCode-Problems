// LeetCode 844. Backspace String Compare
// Complexity
// Time: O(n + m)
// Space: O(n + m)


public class Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        String str1 = removeStars(s);
        String str2 = removeStars(t);

        return str1.equals(str2);
    }

    private static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
