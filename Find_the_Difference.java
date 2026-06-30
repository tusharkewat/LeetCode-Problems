// LeetCode 389. Find the Difference
// Complexity
// Time  O(n)
// Space  O(1)

public class Find_the_Difference {
    public static char findTheDifference(String s, String t) {

        char ans = 0;

        for (char ch : s.toCharArray()) {
            ans ^= ch;
        }

        for (char ch : t.toCharArray()) {
            ans ^= ch;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcd" , t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
