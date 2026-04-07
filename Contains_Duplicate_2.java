// LeetCode 219. Contains Duplicate II
// Using Set + Window
// Complexity
// Time  O(n)
// Space  O(k)

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set <Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1}, k = 3;
        System.err.println(containsNearbyDuplicate(arr, k));
    }
}
