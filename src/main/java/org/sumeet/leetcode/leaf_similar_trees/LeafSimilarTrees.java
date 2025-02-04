package org.sumeet.leetcode.leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> firstTreeList = new ArrayList<>();
        List<Integer> secondTreeList = new ArrayList<>();

        collectLeafNodes(root1, firstTreeList);
        collectLeafNodes(root2, secondTreeList);

        return firstTreeList.equals(secondTreeList);
    }

    public void collectLeafNodes(TreeNode root, List<Integer> leafList){

        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            leafList.add(root.val);
        }
        collectLeafNodes(root.left, leafList);
        collectLeafNodes(root.right, leafList);
    }
    
}
