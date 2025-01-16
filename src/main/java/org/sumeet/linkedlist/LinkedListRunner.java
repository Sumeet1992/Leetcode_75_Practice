package org.sumeet.linkedlist;

public class LinkedListRunner {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(16);
        linkedList.insert(17);

        linkedList.insertAtStart(14);
        linkedList.insertAt(1, 7);

        linkedList.deleteAt(6);

        linkedList.show();

    }

}
