// LeetCode 1518. Water Bottles
// Complexity
// Time: O(log n)
// Space: O(1)

public class Water_Bottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;

            total += newBottles;

            empty = (empty % numExchange) + newBottles;
        }

        return total;
    }

    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;

        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}
