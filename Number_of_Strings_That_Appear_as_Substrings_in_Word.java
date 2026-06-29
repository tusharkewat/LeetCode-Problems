// LeetCode 1967. Number of Strings That Appear as Substrings in Word

public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern : patterns) {
            // if (word.indexOf(pattern) != -1) {
            //     count++;
            // }

            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String patterns[] = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
}
