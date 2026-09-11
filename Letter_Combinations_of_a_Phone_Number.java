// LeetCode 17. Letter Combinations of a Phone Number
// Complexity
// Time:  O(n × 4^n)
// Space: O(n × 4^n)

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        String phone[] = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        StringBuilder current = new StringBuilder();

        backtrack(digits, 0, phone, current, result);

        return result;
    }

    private static void backtrack(String digits, int index,
            String[] phone,
            StringBuilder current,
            List<String> result) {

        if (index ==  digits.length()) {
            result.add(current.toString());
            return ;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            current.append(ch);

            backtrack(digits, index + 1, phone, current, result);

            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String n = "23";
        System.out.println(letterCombinations(n));
    }
}
