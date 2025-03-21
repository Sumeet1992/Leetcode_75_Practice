package org.sumeet.tree.find_nodes_with_k_leaves;

public class FindNodesRunner {

    public static void main(String[] args) {
        FindNodesWithKLeaves findNodesWithKLeaves = new FindNodesWithKLeaves();
        findNodesWithKLeaves.insert(5);
        findNodesWithKLeaves.insert(4);
        findNodesWithKLeaves.insert(7);
        findNodesWithKLeaves.insert(6);
        findNodesWithKLeaves.insert(9);
        Node root = findNodesWithKLeaves.insert(8);

        int nodesCount = findNodesWithKLeaves.countLeaves(root, 1);
        System.out.println();
        System.out.println("Total number of leaves : "+nodesCount);

    }

}
