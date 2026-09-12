// LeetCode 93. Restore IP Addresses
// Complexity
// Time:  O(n)
// Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {
    public static List<String> restoreIpAddresses(String s) {

        List<String> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        backtrack(s, 0, result, current);

        return result;
    }

    private static void backtrack(String s, int start, List<String> result, List<String> current) {

        if (current.size() == 4) {

            if (start == s.length()) {
                result.add(String.join(".", current));
            }

            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {

            String part = s.substring(start, i + 1);

            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            if (Integer.parseInt(part) > 255) {
                break;
            }

            current.add(part);

            backtrack(s, i + 1, result, current);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));
    }
}
