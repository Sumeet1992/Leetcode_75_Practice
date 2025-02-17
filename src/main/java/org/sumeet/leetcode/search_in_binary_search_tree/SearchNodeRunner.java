package org.sumeet.leetcode.search_in_binary_search_tree;


public class SearchNodeRunner {

    public static void main(String[] args) {
        SearchInBinarySearchTree searchTree = new SearchInBinarySearchTree();
        searchTree.insert(4);
        searchTree.insert(2);
        searchTree.insert(7);
        searchTree.insert(1);
        TreeNode root = searchTree.insert(3);

        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(searchTree.searchBST(root,7).val);

    }

}
