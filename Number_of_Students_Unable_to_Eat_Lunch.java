// LeetCode 1700. Number of Students Unable to Eat Lunch
// Complexity
// Time O(n)

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Students_Unable_to_Eat_Lunch {

    // Using Queue
    // Space : O(n)

    public static int count(int[] students, int[] sandwiches) {
        
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            queue.offer(student);
        }

        int sandwichIndex = 0;
        int rotation = 0;
        
        while (!queue.isEmpty()) {

            if (queue.peek() == sandwiches[sandwichIndex]) {

                queue.poll();
                sandwichIndex++;
                rotation = 0;
            } else {

                queue.offer(queue.poll());
                rotation++;

                if (rotation == queue.size()) {
                    break;
                }
            }
        }

        return queue.size();
    }


    // without using Queue
    // Space : O(1)

    public static int countStudents(int[] students, int[] sandwiches) {

        int zero = 0;
        int one = 0;

        for (int student : students) {
            if (student == 0) {
                zero++;
            } else {
                one++;
            }
        }

        for (int sandwich : sandwiches) {

            if (sandwich == 0) {

                if (zero == 0) {
                    break;
                }

                zero--;

            } else {

                if (one == 0) {
                    break;
                }

                one--;
            }
        }

        return zero + one;
    }

    public static void main(String[] args) {
        int students[] = {1,1,1,0,0,1};
        int sanwiches[] = {1,0,0,0,1,1};

        System.out.println(countStudents(students, sanwiches));
    }
}
