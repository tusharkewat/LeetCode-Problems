// LeetCode 649. Dota2 Senate
// Complexity
// Time: O(n)
// Space: O(n) 

import java.util.LinkedList;
import java.util.Queue;

public class Dota2_Senate {
    public static String predictPartyVictory(String senate) {
        
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {

            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {

            int r = radiant.poll();
            int d = dire.poll();

            if (r < d) {
                radiant.offer(r + n);
            } else {
                dire.offer(d + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        String senate = "DRDD";
        System.out.println(predictPartyVictory(senate));
    }
}
