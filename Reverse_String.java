// LeetCode  344. Reverse String
// Complexity
// Time:  O(n)
// Space:  O(1)

public class Reverse_String {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
