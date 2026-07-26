// LeetCode 1019. Next Greater Node In Linked List

import java.util.ArrayList;
import java.util.Stack;

public class Next_Greater_Node_In_Linked_List {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();

        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i > 0; i--) {

            while (!stack.isEmpty() 
                && list.get(i) > list.get(stack.peek())) {

                ans[stack.pop()] = list.get(i);
            }

            stack.push(i);
        }

        return ans;
    }
}
