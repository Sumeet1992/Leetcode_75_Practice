package org.sumeet.tree.max_height_of_binary_tree;

public class FindMaxHeightRunner {

    public static void main(String[] args) {

        FindMaxHeight findMaxHeight = new FindMaxHeight();
        findMaxHeight.insert('e');
        findMaxHeight.insert('b');
        findMaxHeight.insert('c');
        findMaxHeight.insert('d');
        findMaxHeight.insert('a');
        findMaxHeight.insert('f');
        findMaxHeight.insert('g');
        findMaxHeight.insert('h');
        findMaxHeight.insert('i');
        Node root = findMaxHeight.insert('j');

        System.out.println(findMaxHeight.height(root));



    }


}
