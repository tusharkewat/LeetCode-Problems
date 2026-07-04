// LeetCode 141. Linked List Cycle
// Complexity
// Time  O(n)
// Space  O(1)

// Solve using fast and slow pointer (Floyd Warshall)

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
