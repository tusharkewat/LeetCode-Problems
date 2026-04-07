// LeetCode 349. Intersection of Two Arrays
// Complexity 
// Time O(n + m)
// Space  O(n)

import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int arr[] = new int[result.size()];
        int i = 0;
        for (int num : result) {
            arr[i++] = num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {4,9,5}, arr2[] = {9,4,9,8,4};
        int res[] = intersection(arr1, arr2);
        
        for (int i = 0; i < res.length; i++) {
            System.err.print(res[i] + " ");
        }
    }
}
