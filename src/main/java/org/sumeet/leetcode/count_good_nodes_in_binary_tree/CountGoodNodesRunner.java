package org.sumeet.leetcode.count_good_nodes_in_binary_tree;

public class CountGoodNodesRunner {

    public static void main(String[] args) {
        CountGoodNodes countGoodNodes = new CountGoodNodes();
        countGoodNodes.insert(3);
        countGoodNodes.insert(4);
        countGoodNodes.insert(5);
        TreeNode root = countGoodNodes.insert(2);

        System.out.println(countGoodNodes.goodNodes(root));

    }

}
