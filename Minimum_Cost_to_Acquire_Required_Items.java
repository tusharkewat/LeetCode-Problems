// LeetCode 3789. Minimum Cost to Acquire Required Items
// Complexity
// Time: O(1)
// Space: O(1)

public class Minimum_Cost_to_Acquire_Required_Items {
    public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long option1 = (long) need1 * cost1
                + (long) need2 * cost2;

        int min = Math.min(need1, need2);
        int max = Math.max(need1, need2);

        long option2 = (long) min * costBoth
                + (long) (need1 - min) * cost1
                + (long) (need2 - min) * cost2;

        long option3 = (long) max * costBoth;

        return Math.min(option1, Math.min(option2, option3));
    }

    public static void main(String[] args) {
        int cost1 = 3;
        int cost2 = 2;
        int costBoth = 1;
        int need1 = 3;
        int need2 = 2;
        System.out.println(minimumCost(cost1, cost2, costBoth, need1, need2));
    }
}
