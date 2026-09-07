// LeetCode 509. Fibonacci Number 

public class Fibonacci_Number {

    // recursive version    Time = O(2ⁿ)  space = O(n)

    // public static int fib(int n) {
        
    //     if (n <= 1) 
    //         return n;

    //     return fib(n - 1) + fib(n - 2);
    // }

    public static int fib(int n) { // Time = O(n)    space = O(1)
        
        if (n <= 1) 
            return n;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
