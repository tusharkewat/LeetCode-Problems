// LeetCode 504. Base 7
// Complexity
// Time: O(log₇ n)
// Space: O(log₇ n)

public class Base_7 {
    public static String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;

        num = Math.abs(num);

        StringBuilder answer = new StringBuilder();

        while (num > 0) {

            int remainder = num % 7;

            answer.append(remainder);

            num = num / 7;
        }

        if (negative) {
            answer.append('-');
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(convertToBase7(num));
    }
}
