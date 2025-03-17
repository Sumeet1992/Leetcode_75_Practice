package org.sumeet.tree.breadth_first_search;

public class BFSRunner {
    public static void main(String[] args) {

        BFS bfs = new BFS();
        bfs.insert(1);
        bfs.insert(2);
        bfs.insert(3);
        bfs.insert(4);
        bfs.insert(5);
        bfs.insert(6);
        bfs.insert(7);
        Node root = bfs.insert(8);

        bfs.bfs_search(root);

    }
}
