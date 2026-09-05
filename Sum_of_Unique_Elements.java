// LeetCode 1748. Sum of Unique Elements
// Complexity
// Time: O(n)
// Space: O(n) 

import java.util.HashMap;

public class Sum_of_Unique_Elements {
    public static int sumOfUnique(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int sum = 0;

        for (int i : map.keySet()) {

            if (map.get(i)== 1) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,2};
        System.out.print(sumOfUnique(nums));
    }
}
