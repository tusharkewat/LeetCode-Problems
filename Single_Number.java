// LeetCode 136. Single Number

// import java.util.HashMap;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        // XOR methode

        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;

        // HashMap

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int num : nums) {
        //     if (map.get(num) == 1) {
        //         return num;
        //     }
        // }

        // return -1;
    }

    public static void main(String[] args) {
        int num[] = {4,1,2,1,2};
        System.out.println(singleNumber(num));
    }
}
