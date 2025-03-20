package org.sumeet.leetcode.count_good_nodes_in_binary_tree;

import java.util.Stack;

public class CountGoodNodes {

    TreeNode root;

    public TreeNode insert(Integer data){
        root = insertRecursively(root, data);
        return root;
    }

    public TreeNode insertRecursively(TreeNode root, Integer data) {

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

    public int goodNodes(TreeNode root) {
        Stack<Integer> nodeStack = new Stack<>();
        nodeStack.push(root.val);
        int nodesCount = 0;
        nodesCount = countGoodNodes(root, nodeStack, nodesCount);
        nodeStack.pop();
        return nodesCount;
    }

    public int countGoodNodes(TreeNode node, Stack<Integer> nodeStack, int nodesCount) {

        if (node != null) {
            Integer n = nodeStack.peek();
            if (node.val >= n) {
                nodesCount++;
            }
            nodeStack.push(Math.max(node.val, n));
            nodesCount = countGoodNodes(node.left, nodeStack, nodesCount);
            nodesCount = countGoodNodes(node.right, nodeStack, nodesCount);
            nodeStack.pop();

        }
        return nodesCount;
    }



}
