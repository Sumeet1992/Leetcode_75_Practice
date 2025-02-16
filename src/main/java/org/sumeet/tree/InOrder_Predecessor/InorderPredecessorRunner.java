package org.sumeet.tree.InOrder_Predecessor;

import org.sumeet.tree.InOrder_Predecessor.Node;

public class InorderPredecessorRunner {

    public static void main(String[] args) {

        InorderPredecessor treeWithoutRecursion = new InorderPredecessor();
        treeWithoutRecursion.insert(8);
        treeWithoutRecursion.insert(7);
        treeWithoutRecursion.insert(12);
        treeWithoutRecursion.insert(15);
        treeWithoutRecursion.insert(2);
        treeWithoutRecursion.insert(5);
        treeWithoutRecursion.insert(1);

        treeWithoutRecursion.inOrderTraversal();

        System.out.println();
        Node node = treeWithoutRecursion.findNodeFromData(15);
        System.out.println(node.data);

        treeWithoutRecursion.findInorderPredecessor(node);

    }

}
