// LeetCode 292. Nim Game
// Complexity
// Time: O(1)
// Space: O(1)

public class Nim_Game {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(canWinNim(n));
    }
}
