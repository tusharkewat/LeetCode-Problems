// LeetCode 2130. Maximum Twin Sum of a Linked List
// Complexity
// Time  O(n)
// Space  O(1)

public class Maximum_Twin_Sum_of_a_Linked_List {
    public int pairSum(ListNode head) {  // 5 -> 4 -> 2 -> 1
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = mid;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int max = Integer.MIN_VALUE;

        while (head != null && prev != null) {
            int sum = head.val + prev.val;
            head = head.next;
            prev = prev.next;

            max = Math.max(max, sum);
        }

        return max;
    }
}
