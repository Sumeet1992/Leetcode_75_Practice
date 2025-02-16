package org.sumeet.tree.InOrder_Predecessor;

import org.sumeet.tree.InOrder_Predecessor.Node;

public class InorderPredecessor {

    Node root;

    public void insert(int data){

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


    }

    public void inOrderTraversal(){

        inOrderTraversalRecursively(root);

    }

    public void inOrderTraversalRecursively(Node root) {

        if (root!= null){

            inOrderTraversalRecursively(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRecursively(root.right);
        }
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

    public void findInorderPredecessor(Node p){

        if(p.left != null){
            Node temp = p.left;
            while(temp.right != null){
                temp = temp.right;
            }
            System.out.println("Predecessor is : "+ temp.data);
        }
        else{
            Node q = root;
            Node predecessor = null;
            while(p.data != q.data){
                if(p.data > q.data){
                    predecessor = q;
                    q = q.right;
                }
                else{
                    q = q.left;
                }
            }
            System.out.println("Predecessor is : " + predecessor.data);
        }

    }

}
