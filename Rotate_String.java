// LeetCode 796. Rotate String
// Complexity	
// Time	    O(n)
// Space	O(n)

public class Rotate_String {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
