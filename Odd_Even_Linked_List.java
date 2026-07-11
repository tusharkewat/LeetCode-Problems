// LeetCode 328. Odd Even Linked List
// Complexity
// Time  O(n)
// Space  O(1)

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) 
            return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
