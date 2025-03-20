package org.sumeet.tree.zig_zag_travel_in_binary_tree;

import java.util.Stack;

public class ZigZagTraversal {
    
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

    public void spiral(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node n = s1.pop();
                System.out.print(n.data + " ");
                if(n.left != null){
                    s2.push(n.left);
                }
                if(n.right != null){
                    s2.push(n.right);
                }
            }
            while(!s2.isEmpty()){
                Node n = s2.pop();
                System.out.print(n.data + " ");
                if(n.right != null){
                    s1.push(n.right);
                }
                if(n.left != null){
                    s1.push(n.left);
                }
            }
        }
    }
    
}
