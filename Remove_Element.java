// Leetcode 27. Remove Element
// Using Two pointer methode

// Complexity
// Time: O(n)
// Space: O(1)

public class Remove_Element {
    public static int removeElement(int[] arr, int val) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        System.err.println(removeElement(arr, 2));
    }
}
