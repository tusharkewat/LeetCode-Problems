// LeetCode 575. Distribute Candies
// Complexity
// Time: O(n)   
// Space: O(n) 


import java.util.HashSet;

public class Distribute_Candies {
    public static int distributeCandies(int[] candyType) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i : candyType) {
            set.add(i);
        }

        int unique = set.size();
        int candiesForSister = candyType.length / 2;

        return Math.min(unique, candiesForSister);
    }

    public static void main(String[] args) {
        int candyType[] = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
