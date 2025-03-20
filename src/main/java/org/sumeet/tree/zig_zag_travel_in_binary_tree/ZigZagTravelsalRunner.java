package org.sumeet.tree.zig_zag_travel_in_binary_tree;

public class ZigZagTravelsalRunner {
    public static void main(String[] args) {
        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();

        zigZagTraversal.insert(6);
        zigZagTraversal.insert(8);
        zigZagTraversal.insert(4);
        zigZagTraversal.insert(7);
        zigZagTraversal.insert(9);
        zigZagTraversal.insert(3);
        zigZagTraversal.insert(5);
        zigZagTraversal.insert(2);
        zigZagTraversal.insert(1);
        Node root = zigZagTraversal.insert(10);

        zigZagTraversal.spiral(root);

    }
}
