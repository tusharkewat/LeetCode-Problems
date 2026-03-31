// LeetCode 26. Remove Duplicates from Sorted Array
// Complexity
// Time: O(n)
// Space: O(1)

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if( arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.err.println(removeDuplicates(arr));
    }
}
