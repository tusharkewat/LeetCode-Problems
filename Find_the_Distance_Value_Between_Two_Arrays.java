// LeetCode 1385. Find the Distance Value Between Two Arrays
// Complexity
// Time: O(n × m)
// Space: O(1)

public class Find_the_Distance_Value_Between_Two_Arrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int answer = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;

            for (int j = 0; j < arr2.length; j++) {

                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr1[] = {4,5,8}, arr2[] = {10,9,1,8}, d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }
}
