// LeetCode 142. Linked List Cycle II
// Complexity
// Time  O(n)
// Space  O(1)

public class Linked_List_Cycle_2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }

        return null;
    }
}
