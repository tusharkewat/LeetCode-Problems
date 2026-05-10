import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> mapCharToWord = new HashMap<>();
        Map<String, Character> mapWordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (mapCharToWord.containsKey(ch)) {

                if (!mapCharToWord.get(ch).equals(word)) {
                    return false;
                }

            } else {
                mapCharToWord.put(ch, word);
            }

            if (mapWordToChar.containsKey(word)) {

                if (mapWordToChar.get(word) != ch) {
                    return false;
                }

            } else {
                mapWordToChar.put(word, ch);
            }
        }

        return true;
    }
}
