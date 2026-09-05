// LeetCode 128. Longest Consecutive Sequence
// Complexity
// Time: O(n)
// Space: O(n) 

import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(length, longest);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.print(longestConsecutive(nums));
    }
}
