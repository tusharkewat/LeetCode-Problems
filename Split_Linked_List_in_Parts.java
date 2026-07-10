// LeetCode 725. Split Linked List in Parts
// Complexity
// Time  O(n)
// Space  O(k)

public class Split_Linked_List_in_Parts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        } 

        int baseSize = length / k;
        int extraSize = length % k;

        ListNode [] result = new ListNode[k];
        current = head;

        for (int i = 0; i < k; i++) {
            if (current == null) {
                result[i] = null;
                continue;
            }
            result[i] = current;
            int currentSize = baseSize;
            if (extraSize > 0) {
                currentSize++;
                extraSize--;
            }

            for (int j = 1; j < currentSize; j++) {
                current = current.next;
            }

            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
        }

        return result;
    }
}
