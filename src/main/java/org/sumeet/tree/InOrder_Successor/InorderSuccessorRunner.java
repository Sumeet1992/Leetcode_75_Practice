package org.sumeet.tree.InOrder_Successor;

import org.sumeet.tree.InOrder_Successor.InorderSuccessor;
import org.sumeet.tree.InOrder_Successor.Node;

public class InorderSuccessorRunner {

    public static void main(String[] args) {

        InorderSuccessor treeWithoutRecursion = new InorderSuccessor();
        treeWithoutRecursion.insert(8);
        treeWithoutRecursion.insert(7);
        treeWithoutRecursion.insert(12);
        treeWithoutRecursion.insert(15);
        treeWithoutRecursion.insert(2);
        treeWithoutRecursion.insert(5);
        treeWithoutRecursion.insert(1);

        treeWithoutRecursion.inOrderTraversal();

        System.out.println();
        Node node = treeWithoutRecursion.findNodeFromData(7);
        System.out.println(node.data + " " + node.left.data + " " + node.right);

        treeWithoutRecursion.findInorderSuccessor(node);

    }

}
