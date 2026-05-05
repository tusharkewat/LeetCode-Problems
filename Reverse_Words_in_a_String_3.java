// LeetCode 557. Reverse Words in a String III
// Complexity
// Time:  O(n)
// Space:  O(n)

public class Reverse_Words_in_a_String_3 {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
