package org.sumeet.tree;

public class BinarySearchTreeWithoutRecursion {

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

}
