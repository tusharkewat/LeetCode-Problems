// LeetCode 1486. XOR Operation in an Array
// Complexity
// Time: O(n)
// Space: O(1)

public class XOR_Operation_in_an_Array {
    public static int xorOperation(int n, int start) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println(xorOperation(n, start));
    }
}
