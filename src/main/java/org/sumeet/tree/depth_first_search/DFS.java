package org.sumeet.tree.depth_first_search;

public class DFS {

    Node root;

    public void insert(char data){

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

    public void dfs_search(Node p){

        if(p != null){
            System.out.print(p.data + " ");
            if(p.left != null){
                dfs_search(p.left);
            }
            if(p.right != null){
                dfs_search(p.right);
            }
        }

    }

}
