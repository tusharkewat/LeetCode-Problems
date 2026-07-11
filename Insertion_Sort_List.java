// LeetCode 147. Insertion Sort List
// Complexity
// Time  O(n2)
// Space  O(k)

public class Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current =  head;
        while (current != null) {
            ListNode next = current.next;
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;

            current = next;
        }

        return dummy.next;
    }
}
