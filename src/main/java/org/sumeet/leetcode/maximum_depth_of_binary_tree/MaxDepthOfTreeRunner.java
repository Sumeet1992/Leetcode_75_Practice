package org.sumeet.leetcode.maximum_depth_of_binary_tree;

public class MaxDepthOfTreeRunner {

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        tree.insert(3);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(7);

        System.out.println(tree.maxDepth(tree.root)); // Output: 3
    }

}
