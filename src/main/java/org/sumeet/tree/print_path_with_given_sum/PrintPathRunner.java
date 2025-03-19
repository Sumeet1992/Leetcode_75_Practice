package org.sumeet.tree.print_path_with_given_sum;

public class PrintPathRunner {

    public static void main(String[] args) {
        PrintPathForGivenSum printPathForGivenSum = new PrintPathForGivenSum();
        printPathForGivenSum.insert(5);
        printPathForGivenSum.insert(3);
        printPathForGivenSum.insert(9);
        printPathForGivenSum.insert(7);
        printPathForGivenSum.insert(6);
        Node root = printPathForGivenSum.insert(8);

        printPathForGivenSum.printPath(root, 29);
    }

}
