// LeetCode 34. Find First and Last Position of Element in Sorted Array
// Complexity
// Time  O(log n)
// Space  O(1)

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return ans;
    }
}
