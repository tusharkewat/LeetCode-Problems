// Leetcode 42. Trapping Rain Water
// Using Two pointer Methode
// Complexity
// Time: O(n)
// Space: O(1)

public  class Traping_Rain_Water {
    public static int trap(int[] arr) {
        int left = 0, right = arr.length - 1;
        int lmax = 0, rmax = 0;
        int water = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= lmax) {
                    lmax = arr[left];
                } else {
                    water += lmax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rmax) {
                    rmax = arr[right];
                } else {
                    water += rmax - arr[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.err.println(trap(arr));
    }
}
