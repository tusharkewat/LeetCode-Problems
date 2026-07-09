// LeetCode 61. Rotate List
// Complexity
// Time  O(n)
// Space  O(1)

public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length; // reduce k 
        if (k == 0) {
            return head;
        }

        tail.next = head; // making circular

        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) { // number of iteration
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
