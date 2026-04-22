// LeetCode 151. Reverse Words in a String
// Complexity 
// Time   O(n)


public class Reverse_Words_in_a_String {
    // Using Built-in Functions
    // Space  O(n)

    // public String reverseWords(String s) {
    //     String[] words = s.trim().split("\\s+");
    //     StringBuilder result = new StringBuilder();

    //     for (int i = words.length - 1; i >= 0; i--) {
    //         result.append(words[i]);
    //         if (i != 0)
    //             result.append(" ");
    //     }

    //     return result.toString();
    // }

    // Using Two Pointer
    // Space  O(n)

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return cleanSpaces(arr);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    private String cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            while (j < n && arr[j] == ' ')
                j++;
            while (j < n && arr[j] != ' ')
                arr[i++] = arr[j++];
            while (j < n && arr[j] == ' ')
                j++;
            if (j < n)
                arr[i++] = ' ';
        }

        return new String(arr, 0, i);
    }
}