package org.sumeet.tree.print_path_with_given_sum;

import java.util.Stack;

public class PrintPathForGivenSum {
    
    Node root;
    Stack<Node> nodeStack = new Stack<>();
    int sum;

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

    public void printPath(Node p, int k){

        if(p == null){
            return;
        }
        sum = sum + p.data;
        nodeStack.push(p);
        if(sum == k){
                nodeStack.forEach(node -> System.out.print(node.data + " "));
        }
        printPath(p.left, k);
        printPath(p.right, k);
        sum = sum - p.data;
        nodeStack.pop();


    }
    
}
