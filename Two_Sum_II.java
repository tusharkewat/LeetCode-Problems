// 167. Two Sum II - Input Array Is Sorted
// Solution: Two Pointers

// Complexity
// Time: O(n) 
// Space: O(1)

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] + arr[j] > target){
                j--;
            } else if(arr[i] + arr[j] < target){
                i++;
            } else {
                return new int[] { i + 1, j+ 1};
            }
        }
        return null;
            
    }
}    
