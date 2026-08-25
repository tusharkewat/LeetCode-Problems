// LeetCode 3718. Smallest Missing Multiple of K
// Complexity
// Time: O(n)
// // Space: O(n)

import java.util.HashSet;

public class Smallest_Missing_Multiple_of_K {
    public static int missingMultiple(int[] nums, int k) {
        
        HashSet <Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }

    public static void main(String[] args) {
        int nums[] = {1,4,7,10,15}, k = 5;
        System.out.println(missingMultiple(nums, k));
    }
}
