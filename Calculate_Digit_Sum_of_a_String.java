// LeetCode 2243. Calculate Digit Sum of a String
// Complexity
// Time: O(n)
// Space: O(n)

public class Calculate_Digit_Sum_of_a_String {
    public static String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {

                    sum += s.charAt(j) - '0';
                }

                sb.append(sum);
            }

            s = sb.toString();
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;

        System.out.println(digitSum(s, k));
    }
}
