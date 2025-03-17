package org.sumeet.tree.breadth_first_search;

import org.sumeet.queue.Queue;

import java.util.PriorityQueue;

public class BFS {
    
    Node root;

    public Node insert(int data){

        Node node = new Node(data);

        if(root == null){
            root = node;
        }
        else{
            Node q = root;
            while(true){
                if(node.data > q.data){
                    if(q.right == null){
                        q.right = node;
                        break;
                    }
                    else{
                        q = q.right;
                    }
                }
                else{
                    if(q.left == null){
                        q.left = node;
                        break;
                    }
                    else{
                        q = q.left;
                    }
                }
            }
        }

        return root;
    }

    public Node findNodeFromData(int data){

        Node q = root;
        while(q != null){
            if(q.data == data){
                return q;
            }
            else if(data < q.data){
                q = q.left;
            }
            else if(data > q.data){
                q = q.right;
            }
        }
        return null;
    }

    public void bfs_search(Node root){
        Queue nodesQueue = new Queue();
        nodesQueue.enqueue(root.data);
        while(! nodesQueue.isEmpty()){
            int p = nodesQueue.dequeue();
            System.out.print(p + " ");
            Node n = findNodeFromData(p);
            if(n.left != null){
                nodesQueue.enqueue(n.left.data);
            }
            if(n.right != null){
                nodesQueue.enqueue(n.right.data);
            }
        }
    }
    
}
