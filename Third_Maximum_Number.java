// LeetCode 414. Third Maximum Number
// Complexity
// Time   O(n)
// Space   O(1)

public class Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int i = 0; i < nums.length; i++) {
            if ((first != null && nums[i] == first) ||
                (second != null && nums[i] == second) ||
                (third != null && nums[i] == third)) {
                continue;
            }

            if (first == null || nums[i] > first) {
                third = second;
                second = first;
                first = (long) nums[i];
            } 
            else if (second == null || nums[i] > second) {
                third = second;
                second = (long) nums[i];
            } 
            else if (third == null || nums[i] > third) {
                third = (long) nums[i];
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,1};
        System.err.println(thirdMax(arr));
    }
}
