// LeetCode 2095. Delete the Middle Node of a Linked List
// Complexity
// Time  O(n)
// Space  O(1)

public class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        prev.next = slow.next;

        return head;
    }
}
