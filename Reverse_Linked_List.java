// LeetCode 206. Reverse Linked List
// Complexity
// Time  O(n)
// Space  O(1)

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;

        return head;
    }
}
