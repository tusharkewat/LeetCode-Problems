// LeetCode 69. Sqrt(x)
// Complexity
// Time O(log n)
// Space O(1)

public class Sqrt_x {
    public static int mySqrt(int x) {
        
        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
