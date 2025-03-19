package org.sumeet.tree.Check_if_2_trees_are_isomorphic;

public class CheckIsomorphicRunner {

    public static void main(String[] args) {
        CheckIfTreesAreIsomorphic areIsomorphic = new CheckIfTreesAreIsomorphic();
        areIsomorphic.insert(5);
        areIsomorphic.insert(2);
        areIsomorphic.insert(3);
        areIsomorphic.insert(1);
        Node root1 = areIsomorphic.insert(4);

        CheckIfTreesAreIsomorphic areIsomorphic2 = new CheckIfTreesAreIsomorphic();
        areIsomorphic2.insert(5);
        areIsomorphic2.insert(2);
        areIsomorphic2.insert(3);
        areIsomorphic2.insert(1);
        Node root2 = areIsomorphic2.insert(4);

        System.out.println(areIsomorphic2.checkIsomorphic(root1, root2));

    }

}
