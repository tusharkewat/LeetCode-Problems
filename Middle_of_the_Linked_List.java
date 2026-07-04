// LeetCode 876. Middle of the Linked List
// Complexity
// Time  O(n/2) or O(n)
// Space  O(1)

public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }
}
