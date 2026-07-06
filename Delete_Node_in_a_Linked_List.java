public class Delete_Node_in_a_Linked_List {
    // Beginning
    public ListNode deleteFromBeginning(ListNode head) {
        head = head.next;

        return head;
    }

    // End
    public ListNode deleteAtEnd(ListNode head) {
        ListNode ptr = head;
        while (ptr.next.next != null)
            ptr = ptr.next;

        ptr.next = null;

        return head;
    }

    // Somewhere
    public ListNode deleteFromMiddle(ListNode head, int position) {
        ListNode ptr = head;
        for (int i = 0; i < position - 1; i++) {
            ptr = ptr.next;
        }

        ListNode nodeToDelete = ptr.next;

        ListNode nextNode = nodeToDelete.next;

        ptr.next = nextNode;

        return head;
    }

    // LeetCode Version
    public void deleteNode(ListNode node) {
        node.val = node.next.val;

        node.next = node.next.next;
    }
}
