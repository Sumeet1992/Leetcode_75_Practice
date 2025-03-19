package org.sumeet.tree.max_height_of_binary_tree;

public class FindMaxHeight {
    
    Node root;

    public Node insert(char data){

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

    public int height(Node n){

        if(n == null){
            return 0;
        }
        int maxHeight;

        int leftHeight = height(n.left);
        int rightHeight = height(n.right);

        if(leftHeight > rightHeight){
            maxHeight = 1 + leftHeight;
        }
        else{
            maxHeight = 1 + rightHeight;
        }

        return maxHeight;
    }
    
}
