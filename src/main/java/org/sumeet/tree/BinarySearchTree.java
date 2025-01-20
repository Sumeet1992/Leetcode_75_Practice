package org.sumeet.tree;

public class BinarySearchTree {

    Node root;

    public void insert(int data){
        root = insertRecursively(root, data);
    }

    public Node insertRecursively(Node root, int data) {

        if(root == null){
            root = new Node(data);
        }
        else if (data < root.data) {
            root.left = insertRecursively(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRecursively(root.right, data);
        }

        return root;
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

}
