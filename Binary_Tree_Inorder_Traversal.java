// LeetCode 94. Binary Tree Inorder Traversal
// Complexity
// Time: O(n)
// Space: O(n)

import java.util.*;

public class Binary_Tree_Inorder_Traversal {
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

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode root, List<Integer> result) {
        // Base case: stop if the node doesn't exist
        if (root == null) {
            return;
        }

        // Left → Root → Right
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
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
        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }
}
