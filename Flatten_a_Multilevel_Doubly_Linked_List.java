// LeetCode 430. Flatten a Multilevel Doubly Linked List
// Complexity
// Time  O(n)
// Space  O(n)

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class Flatten_a_Multilevel_Doubly_Linked_List {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node head) {

        Node curr = head;
        Node last = null;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child != null) {

                Node childHead = curr.child;

                Node childTail = dfs(childHead);

                curr.next = childHead;
                childHead.prev = curr;

                curr.child = null;

                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                last = childTail;
                curr = childTail;
            }
            else {
                last = curr;
            }

            curr = curr.next;
        }

        return last;
    }
}
