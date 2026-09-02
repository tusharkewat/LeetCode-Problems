// LeetCode 950. Reveal Cards In Increasing Order
// Complexity
// Time O(n)
// Space O(n)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Reveal_Cards_In_Increasing_Order {
    public static int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
        
        int n = deck.length;

        int answer[] = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        for (int card : deck) {

            int index = queue.poll();

            answer[index] = card;

            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int deck[] = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }
}
