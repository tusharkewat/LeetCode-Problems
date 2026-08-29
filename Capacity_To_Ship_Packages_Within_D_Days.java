// LeetCode 1011. Capacity To Ship Packages Within D Days
// Complexity
// Time O(n log n)
// Space O(1)

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static int shipWithinDays(int[] weights, int days) {
        
        int minCap = 0;
        int maxCap = 0;

        for (int weight : weights) {

            minCap = Math.max(minCap, weight);
            maxCap += weight;
        }

        while (minCap < maxCap) {

            int mid = minCap + (maxCap - minCap) / 2;

            int day = 1;
            int sum = 0;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    day++;
                    sum = 0;
                }

                sum += weight;
            }

            if (day > days) 
                minCap = mid + 1;
            else
                maxCap = mid;
        }

        return minCap;
    }

    public static void main(String[] args) {
        int weights[] = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
}
