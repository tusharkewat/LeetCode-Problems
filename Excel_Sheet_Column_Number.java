// LeetCode 171. Excel Sheet Column Number
// Complexity
// Time: O(n)
// Space: O(1)

public class Excel_Sheet_Column_Number {
    public static int titleToNumber(String columnTitle) {
        int answer = 0;

        for (char ch : columnTitle.toCharArray()) {
            int value = ch - 'A' + 1;

            answer = answer * 26 + value;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }
}
