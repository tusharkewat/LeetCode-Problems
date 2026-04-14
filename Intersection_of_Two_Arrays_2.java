// 350. Intersection of Two Arrays II
// Complexity
// Approach 	Time	             Space
// HashMap	  O(n + m)	          O(min(n, m))
// Sorting	 O(n log n + m log m)	O(1)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_of_Two_Arrays_2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Using HashMap = Counting frequency 

        Map <Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List <Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                result.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int arr[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;


        // Using Sorting + Two Pointer

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int i = 0, j = 0;
        // List<Integer> list = new ArrayList<>();

        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] == nums2[j]) {
        //         list.add(nums1[i]);
        //         i++;
        //         j++;
        //     } else if (nums1[i] < nums2[j]) {
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }

        // int[] res = new int[result.size()];
        // for (int k = 0; k < result.size(); k++) {
        //     res[k] = result.get(k);
        // }

        // return res;
    }
}
