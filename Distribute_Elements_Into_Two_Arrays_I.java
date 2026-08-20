// LeetCode 3069. Distribute Elements Into Two Arrays I

import java.util.ArrayList;

public class Distribute_Elements_Into_Two_Arrays_I {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int last1 = arr1.get(arr1.size() - 1);
            int last2 = arr2.get(arr2.size() - 1);

            if (last1 > last2) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        arr1.addAll(arr2);

        int[] result = new int[arr1.size()];

        for (int i = 0; i < arr1.size(); i++) {
            result[i] = arr1.get(i);
        }

        return result;
    }
}
