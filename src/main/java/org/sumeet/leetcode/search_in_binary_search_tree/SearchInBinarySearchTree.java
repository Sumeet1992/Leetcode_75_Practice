package org.sumeet.leetcode.search_in_binary_search_tree;


public class SearchInBinarySearchTree {
    
    TreeNode root;

    public TreeNode insert(int data){
        root = insertRecursively(root, data);
        return root;
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

    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode q = root;
        while(q != null){
            if(q.val == val){
                return q;
            }
            else if (val < q.val)
            {
                q = q.left;
            }
            else{
                q = q.right;
            }
        }

        return null;
    }
    
}
