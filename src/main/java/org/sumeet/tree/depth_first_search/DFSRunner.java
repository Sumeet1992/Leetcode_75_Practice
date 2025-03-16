package org.sumeet.tree.depth_first_search;

public class DFSRunner {

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.insert('a');
        dfs.insert('b');
        dfs.insert('c');
        dfs.insert('d');
        dfs.insert('e');
        dfs.insert('h');
        dfs.insert('i');
        dfs.insert('n');
        dfs.insert('f');
        dfs.insert('g');
        dfs.insert('j');
        dfs.insert('m');
        dfs.insert('p');
        dfs.insert('l');
        dfs.insert('k');
        dfs.insert('q');
        dfs.insert('r');


        Node node = dfs.findNodeFromData('a');
        dfs.dfs_search(node);

    }
    
}
