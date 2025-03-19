package org.sumeet.tree.Check_if_2_trees_are_isomorphic;

public class CheckIfTreesAreIsomorphic {
    
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

    public boolean checkIsomorphic(Node root1, Node root2){

        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        if(
                ( checkIsomorphic(root1.left, root2.left) && checkIsomorphic(root1.right, root2.right) )
            || ( checkIsomorphic(root1.left, root2.right) && checkIsomorphic(root1.right, root2.left) )
        ){
            return true;
        }
        else{
            return false;
        }

    }
    
}
