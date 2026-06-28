public class Pow_x_n {
    public static double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        double answer = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                answer *= x;
                power--;
            } else {
                x *= x;
                power /= 2;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(myPow(x, n));
    }
}
