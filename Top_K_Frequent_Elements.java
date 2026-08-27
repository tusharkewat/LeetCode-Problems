// LeetCode 347. Top K Frequent Elements
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.*;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : freq.keySet()) {

            int frequency = freq.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        int ans[] = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {

            if (buckets[i] != null) {

                for (int num : buckets[i]) {

                    ans[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
