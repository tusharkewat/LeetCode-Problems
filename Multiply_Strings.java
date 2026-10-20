// LeetCode 43. Multiply Strings
// Complexity
// Time: O(mn)
// Space: O(m + n)

public class Multiply_Strings {
    public static String multiply(String num1, String num2) {
        
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int result[] = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int product = a * b + result[i + j + 1];

                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int digit : result) {

            if (answer.length() == 0 && digit == 0) {
                continue;
            }

            answer.append(digit);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1, num2));
    }
}
