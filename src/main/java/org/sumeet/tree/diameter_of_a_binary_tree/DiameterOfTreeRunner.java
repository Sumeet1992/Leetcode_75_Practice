package org.sumeet.tree.diameter_of_a_binary_tree;

public class DiameterOfTreeRunner {

    public static void main(String[] args) {
        DiameterOfTree diameterOfTree = new DiameterOfTree();
        diameterOfTree.insert('e');
        diameterOfTree.insert('a');
        diameterOfTree.insert('b');
        Node root = diameterOfTree.insert('d');

        System.out.println(diameterOfTree.diameter(root));

    }

}
