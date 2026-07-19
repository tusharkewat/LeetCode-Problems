// LeetCode 1047. Remove All Adjacent Duplicates In String
// Complexity
// Time  O(n)
// Space  O(n)

public class Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else 
                stack.append(c);
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }
}
