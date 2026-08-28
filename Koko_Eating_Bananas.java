// LeetCode 875. Koko Eating Bananas
// Complexity
// Time O(n log n)
// Space O(1)

public class Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        
        int minSpeed = 1;
        int maxSpeed = 0;

        for (int pile : piles) 
            maxSpeed = Math.max(maxSpeed, pile);

        int ans = maxSpeed;

        while (minSpeed <= maxSpeed) {

            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int piles[] = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
