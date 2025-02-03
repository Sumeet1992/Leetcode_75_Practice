package org.sumeet.leetcode.maximum_depth_of_binary_tree;

import org.sumeet.tree.Node;

public class MaximumDepthOfBinaryTree {

    TreeNode root;

    public void insert(int data){
        root = insertRecursively(root, data);
    }

    public TreeNode insertRecursively(TreeNode root, int data) {

        if(root == null){
            root = new TreeNode(data);
        }
        else if (data < root.val) {
            root.left = insertRecursively(root.left, data);
        }
        else if(data > root.val){
            root.right = insertRecursively(root.right, data);
        }

        return root;
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
