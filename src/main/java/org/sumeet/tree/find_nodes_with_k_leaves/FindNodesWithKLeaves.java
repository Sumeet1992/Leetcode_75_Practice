package org.sumeet.tree.find_nodes_with_k_leaves;

public class FindNodesWithKLeaves {
    
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

    public int countLeaves(Node p, int k){

        if(p.left == null && p.right == null){
            return 1;
        }
        int leftLeafCount = 0;
        int rightLeafCount = 0;
        if(p.left != null) {
            leftLeafCount = countLeaves(p.left, k);
        }
        if(p.right != null) {
            rightLeafCount = countLeaves(p.right, k);
        }

        int totalLeafCount = leftLeafCount + rightLeafCount;

        if(totalLeafCount == k){
            System.out.print(p.data + " ");
        }
        return totalLeafCount;
    }
    
}
