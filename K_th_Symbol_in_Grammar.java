// LeetCode 779. K-th Symbol in Grammar
// Complexity
// Time:  O(n)
// Space: O(n)

public class K_th_Symbol_in_Grammar {
    public static int kthGrammar(int n, int k) {
        
        if (n == 1) 
            return 0;

        int half = 1 << (n - 2);

        if (k <= half) {
            return kthGrammar(n - 1, k);
        }

        return 1 - kthGrammar(n - 1, k - half);
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(kthGrammar(n, k));
    }
}
