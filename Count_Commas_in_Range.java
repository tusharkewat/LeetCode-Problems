// LeetCode 3870. Count Commas in Range
// Complexity
// Time:  O(1)
// Space: O(1)

public class Count_Commas_in_Range {
    public static int countCommas(int n) {
        
        if (n < 1000) 
            return 0;

        return n - 999;
    }

    public static void main(String[] args) {
        int n = 100000;
        System.out.println(countCommas(n));
    }
}
