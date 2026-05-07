// 917. Reverse Only Letters
// Complexity	
// Time	    O(n)
// Space	O(n)

public class Reverse_Only_Letters {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
