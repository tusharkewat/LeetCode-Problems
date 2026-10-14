// LeetCode 3723. Maximize Sum of Squares of Digits
// Complexity
// Time: O(num)
// Space: O(num)

public class Maximize_Sum_of_Squares_of_Digits {
    public static String maxSumOfSquares(int num, int sum) {
        
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (sum >= 9) {
            ans.append('9');
            sum -= 9;
        }

        if (sum > 0) {
            ans.append(sum);
        }

        while (ans.length() < num) {
            ans.append('0');
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        int num = 2, sum = 17;
        System.out.println(maxSumOfSquares(num, sum));
    }
}
