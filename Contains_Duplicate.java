// LeetCode 217. Contains Duplicate
// Complexity
// Time  O(n)
// Space  O(1)

// import java.util.HashMap;
import java.util.HashSet;
// import java.util.Map;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Using HashMap 

        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int curr = nums[i];
        //     map.put(curr, map.getOrDefault(curr, 0) + 1);
        // }
        // if (map.size() == nums.length) {
        //     return true;
        // } else {
        //     return false;
        // }

        // Using HashSet

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.err.println(containsDuplicate(arr));
    }
}
