// LeetCode 405. Convert a Number to Hexadecimal
// Complexity
// Time: O(1)
// Space: O(1)

public class Convert_a_Number_to_Hexadecimal {
    public static String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();

        StringBuilder answer = new StringBuilder();

        while (num != 0) {

            int digit = num & 15;

            answer.append(hex[digit]);

            num = num >>> 4;
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 26;
        System.out.println(toHex(n));
    }
}
