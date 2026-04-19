// LeetCode 287. Find the Duplicate Number
// Complexity 
// Time   O(n)
// Space  O(1)

// import java.util.HashSet;

public class Find_the_Duplicate_Number {
    // Using Floyd’s Cycle Detection
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    // Using HashSet
    // public int findDuplicate(int[] nums) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {
    // if (set.contains(nums[i])) {
    // return nums[i];
    // } else {
    // set.add(nums[i]);
    // }
    // }
    // return -1;
    // }
}
