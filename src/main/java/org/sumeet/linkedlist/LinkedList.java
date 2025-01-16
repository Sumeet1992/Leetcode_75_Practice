package org.sumeet.linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data){

        Node n = new Node();
        n.data = data;
        n.next = null;
        if(head == null){
            head = n;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        n.next = null;

        n.next = head;
        head = n;
    }

    public void insertAt(int index, int data){

        Node n = new Node();
        n.data = data;
        n.next = null;

        if(index == 0){
            insertAtStart(data);
        }
        else{
            Node node = head;
            for(int i = 0; i < index-1; i++){
                node = node.next;
            }
            n.next = node.next;
            node.next = n;
        }
    }

    public void deleteAt(int index){

        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node nodeToBeDeleted = null;

            for(int i = 0; i < index - 1; i++){
                n = n.next;
            }
            nodeToBeDeleted = n.next;
            n.next = nodeToBeDeleted.next;
            nodeToBeDeleted = null;
        }

    }

    public void show(){

        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

}
