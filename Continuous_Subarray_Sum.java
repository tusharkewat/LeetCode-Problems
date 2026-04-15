// 523. Continuous Subarray Sum
// Complexity 
// Time  O(n)
// Space  O(k) or O(n)

import java.util.HashMap;

public class Continuous_Subarray_Sum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {23,2,4,6,7}, k = 6;
        System.out.println(checkSubarraySum(arr,k));
    }
}
