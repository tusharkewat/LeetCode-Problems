// LeetCode 9. Palindrome Number

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
