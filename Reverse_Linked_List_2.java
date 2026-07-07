// LeetCode 92. Reverse Linked List II
// Complexity
// Time  O(n)
// Space  O(1)

public class Reverse_Linked_List_2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Two Marker for finding reversal node and its before
        ListNode leftPre = dummy;
        ListNode currNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        // Another marker node for storing the value of starting node before reversing
        ListNode subListHead = currNode;
        ListNode preNode = null;
        
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        leftPre.next = preNode;
        subListHead.next = currNode;

        return dummy.next;
    }
}
