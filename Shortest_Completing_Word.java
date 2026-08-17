// LeetCode 748. Shortest Completing Word

public class Shortest_Completing_Word {
     public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] required = new int[26];

        for (char c : licensePlate.toCharArray()) {

            if (Character.isLetter(c)) {

                c = Character.toLowerCase(c);

                required[c - 'a']++;
            }
        }

        String answer = "";

        for (String word : words) {

            int[] freq = new int[26];

            for (char c : word.toCharArray()) {

                c = Character.toLowerCase(c);

                freq[c - 'a']++;
            }

            boolean completing = true;

            for (int i = 0; i < 26; i++) {

                if (freq[i] < required[i]) {
                    completing = false;
                    break;
                }
            }

            if (completing &&
                (answer.equals("") || word.length() < answer.length())) {

                answer = word;
            }
        }

        return answer;
    }
}
