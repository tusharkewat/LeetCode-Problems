// LeetCode 709. To Lower Case
// Complexity	
// Time	    O(n)
// Space	O(n)

public class To_Lower_Case {
    public String toLowerCase(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 'A' && arr[i] <= 'Z') {

                arr[i] = (char) (arr[i] + 32);
            }
        }

        return new String(arr);
    }
}
