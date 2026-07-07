// LeetCode 19. Remove Nth Node From End of List
// Complexity
// Time  O(n)
// Space  O(1)

public class Remove_Nth_Node_From_End_of_List {
    // Using Two Pointer
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Brute Force

    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     int count = 0;
    //     ListNode ptr = head;

    //     while (ptr != null) {
    //         count++;
    //         ptr = ptr.next;
    //     }
    //     if (count == n) {
    //         return head.next;
    //     }
    //     ptr = head;
    //     for (int i = 1; i < count - n; i++) {
    //         ptr = ptr.next;
    //     }

    //     ptr.next = ptr.next.next;

    //     return head;
    // }
}
