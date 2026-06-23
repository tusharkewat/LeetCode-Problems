// LeetCode 2540. Minimum Common Value
// Complexity
// Time  O(n + m)
// Space  O(1)

public class Minimum_Common_Value {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6};
        int arr2[] = {2,3,4,5};
        System.out.println(getCommon(arr1, arr2)); 
    }
}
