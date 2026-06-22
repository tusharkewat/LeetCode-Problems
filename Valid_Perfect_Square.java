// LeetCode 367. Valid Perfect Square
// Complexity
// Time  O(log n)
// Space  O(1)

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;

        while(left <= right){

            long mid = left + (right - left) / 2;

            long square = mid * mid;

            if(square == num){
                return true;
            }
            else if(square < num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return false;
    }
}
