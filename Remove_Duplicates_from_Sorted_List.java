// LeetCode 83. Remove Duplicates from Sorted List
// Complexity
// Time  O(n)
// Space  O(1)

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
