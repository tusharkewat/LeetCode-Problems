// leetCode 3876. Construct Uniform Parity Array II
// Complexity
// Time: O(n)   
// Space: O(1) 

public class Construct_Uniform_Parity_Array_II {
    public static boolean uniformArray(int[] nums1) {
        
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            
            if (x % 2 == 1) {
                minOdd = Math.min(x, minOdd);
            }
        }

        for (int x : nums1) {

            if (x % 2 == 0 && minOdd != Integer.MAX_VALUE) {

                if (x < minOdd) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int nums[] = {1,4,7};
        System.out.println(uniformArray(nums));
    }
}
