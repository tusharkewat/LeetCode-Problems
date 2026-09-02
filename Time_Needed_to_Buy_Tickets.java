// LeetCode 2073. Time Needed to Buy Tickets
// Complexity
// Time O(n)
// Space O(n)

import java.util.LinkedList;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {

            // Take the person from the front
            int person = queue.poll();

            // Person buy some tickets
            tickets[person]--;

            // Taking time to buy tickets
            time++;

            // If person k buys all tickets return time
            if (person == k && tickets[person] == 0) {
                return time;
            }

            // if person still needs ticket put them into back
            if (tickets[person] > 0) {
                queue.offer(person);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int tickets[] = {2,3,2}, k = 2;
        System.out.println(timeRequiredToBuy(tickets, k) + " Seconds");
    }
}
