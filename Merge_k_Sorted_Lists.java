// LeetCode 23. Merge k Sorted Lists
// Complexity
// Time  O(n log n)
// Space  O(log n)

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) 
            return null;

        return mergeAll(lists, 0, lists.length - 1);
    }

    private ListNode mergeAll (ListNode [] lists, int start, int end) {
        if (start == end) 
            return lists[start];

        if (start + 1 == end) 
            return merge(lists[start], lists[end]);

        int mid = start + (end - start) / 2;

        ListNode left = mergeAll(lists, start, mid);
        ListNode right = mergeAll(lists, mid + 1, end);

        return merge(left, right);
    }

    private ListNode merge (ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return dummy.next;
    }
}
