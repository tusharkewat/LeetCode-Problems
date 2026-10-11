// LeetCode 145. Binary Tree Postorder Traversal
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    public static void postOrder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return ;
        }

        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public static void main(String[] args) {
        // Create the binary tree
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Call the function and print the result
        List<Integer> result = postorderTraversal(root);
        System.out.println(result);
    }
}
