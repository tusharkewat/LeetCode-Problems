// LeetCode 3014. Minimum Number of Pushes to Type Word I
// Complexity
// Time  O(n)
// Space  O(1)

public class Minimum_Number_of_Pushes_to_Type_Word_I {
    public static int minimumPushes(String word) {
        
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += (i / 8) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        String word = "xycdefghij";
        System.out.println(minimumPushes(word));
    }
}
