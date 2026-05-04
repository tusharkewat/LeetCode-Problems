// LeetCode 520. Detect Capital
// Complexity
// Time:  O(n)
// Space:  O(1)

public class Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int count = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        if (count == word.length())
            return true;

        if (count == 0)
            return true;

        if (count == 1 && Character.isUpperCase(word.charAt(0)))
            return true;

        return false;
    }
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
}
