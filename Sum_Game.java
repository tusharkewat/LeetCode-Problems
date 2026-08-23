// LeetCode 1927. Sum Game
// Complexity
// Time: O(n)
// // Space: O(1)

public class Sum_Game {
    public static boolean sumGame(String num) {

        int n = num.length();
        
        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        // Alice wins when number of '?' = odd 

        if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }

        // Bob wins when this equation is satisfy if not Alice win
        return leftSum - rightSum != 9 * (rightQ - leftQ) / 2;
    }

    public static void main(String[] args) {
        String num = "?3295???";
        System.out.println(sumGame(num));
    }
}
