// LeetCode 599. Minimum Index Sum of Two Lists
// Complexity
// Time: O(n)   
// Space: O(n) 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {

            String restaurant = list2[i];

            if (map.containsKey(restaurant)) {

                int sum = map.get(restaurant) + i;

                if (sum < minSum) {

                    minSum = sum;

                    ans.clear();

                    ans.add(restaurant);

                } else if (sum == minSum) {

                    ans.add(restaurant);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}
