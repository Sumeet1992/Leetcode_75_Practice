package org.sumeet.leetcode.leaf_similar_trees;

import com.sun.source.tree.Tree;

public class LeafSimilarTreesRunner {

    public static void main(String[] args) {
        LeafSimilarTrees leafSimilarTrees1 = new LeafSimilarTrees();
        LeafSimilarTrees leafSimilarTrees2 = new LeafSimilarTrees();

        leafSimilarTrees1.insert(2);
        leafSimilarTrees1.insert(1);
        TreeNode root1 = leafSimilarTrees1.insert(3);

        leafSimilarTrees2.insert(2);
        leafSimilarTrees2.insert(1);
        TreeNode root2 = leafSimilarTrees2.insert(3);

        System.out.println(leafSimilarTrees2.leafSimilar(root1, root2));
    }

}
