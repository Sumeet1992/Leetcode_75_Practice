package org.sumeet.tree;

public class TreeRunner {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);

        tree.inOrderTraversal();

        System.out.println();

        BinarySearchTreeWithoutRecursion treeWithoutRecursion = new BinarySearchTreeWithoutRecursion();
        treeWithoutRecursion.insert(8);
        treeWithoutRecursion.insert(7);
        treeWithoutRecursion.insert(12);
        treeWithoutRecursion.insert(15);
        treeWithoutRecursion.insert(2);
        treeWithoutRecursion.insert(5);
        treeWithoutRecursion.insert(1);

        treeWithoutRecursion.inOrderTraversal();


    }



}
