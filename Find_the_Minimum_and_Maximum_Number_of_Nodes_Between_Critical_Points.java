// LeetCode 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
// Complexity
// Time O(n)
// Space O(1)

public class Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;

        int ans[] = {-1,-1};

        int index = 1;

        int first = -1;
        int last = -1;

        int minDistance = Integer.MAX_VALUE;

        while (curr.next != null) {

            if ((curr.val > prev.val && curr.val > curr.next.val ||
                (curr.val < prev.val && curr.val < curr.next.val))) {

                if (first == -1) {

                    first = index;

                } else {

                    minDistance = Math.min(minDistance, index - last);
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (first == last) {
            return ans;
        }

        int maxDistance = last - first;

        ans[0] = minDistance;
        ans[1] = maxDistance;

        return ans;
    }
}
