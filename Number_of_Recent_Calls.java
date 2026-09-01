// LeetCode 933. Number of Recent Calls

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Recent_Calls {
    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {

            queue.offer(t);

            while (queue.peek() < t - 3000) {
                queue.poll();
            }

            return queue.size();
        }
    }
}
