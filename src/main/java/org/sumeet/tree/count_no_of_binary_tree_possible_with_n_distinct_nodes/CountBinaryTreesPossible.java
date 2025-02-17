package org.sumeet.tree.count_no_of_binary_tree_possible_with_n_distinct_nodes;

public class CountBinaryTreesPossible {

    public static void main(String[] args) {
        CountBinaryTreesPossible binaryTreesPossible = new CountBinaryTreesPossible();
        System.out.println(binaryTreesPossible.countBinaryTreesPossible(5));
    }

    public int countBinaryTreesPossible(int noOfNodes){

        int[] treesPossible = new int[noOfNodes + 1];

        treesPossible[0] = 1;
        treesPossible[1] = 1;
        for(int  i = 2; i <= noOfNodes; i++){
            for(int j = 0; j < i; j++){
                treesPossible[i] = treesPossible[i] + (treesPossible[j] * treesPossible[i - j - 1]);
            }
        }

        return treesPossible[noOfNodes];

    }

}
