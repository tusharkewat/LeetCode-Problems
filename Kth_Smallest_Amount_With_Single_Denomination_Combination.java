// LeetCode 3116. Kth Smallest Amount With Single Denomination Combination

public class Kth_Smallest_Amount_With_Single_Denomination_Combination {
    public long findKthSmallest(int[] coins, int k) {

        long left = 1;
        long right = (long) coins[0] * k;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (count(mid, coins) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long count(long x, int[] coins) {

        int n = coins.length;
        long total = 0;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;
            boolean overflow = false;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    bits++;

                    long gcd = gcd(lcm, coins[i]);
                    long value = lcm / gcd;

                    if (value > x / coins[i]) {
                        overflow = true;
                        break;
                    }

                    lcm = value * coins[i];
                }
            }

            if (overflow || lcm > x) {
                continue;
            }

            long contribution = x / lcm;

            if (bits % 2 == 1) {
                total += contribution;
            } else {
                total -= contribution;
            }
        }

        return total;
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
