package org.sumeet.tree.diameter_of_a_binary_tree;

public class DiameterOfTree {

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

    public int height(Node p){


        if(p == null){
            return 0;
        }
        int maxheight;
        int leftHeight = height(p.left);
        int rightHeight = height(p.right);

        if(leftHeight > rightHeight){
            maxheight = leftHeight + 1;
        }
        else{
            maxheight = rightHeight + 1;
        }
        return maxheight;
    }

    public int diameter(Node p){

        if(p == null){
            return 0;
        }

        int leftHeight = height(p.left);
        int rightHeight = height(p.right);
        int leftDiameter = diameter(p.left);
        int rightDiameter = diameter(p.right);

        int d = Math.max(1 + leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));

        return d;

    }
    
}
