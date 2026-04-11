// LeetCode 904. Fruit Into Baskets
// Complexity
// Time:  O(n) 
// Space:  O(2) ≈ O(1)

import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Baskets {
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2};
        System.err.println(totalFruit(arr));
    }
}
