package org.sumeet.leetcode.delete_middle_node_of_linkedList;

public class ListNodeRunner {

    public static void main(String[] args) {
        DeleteMiddleNodeOfLinkedList middleNodeOfLinkedList = new DeleteMiddleNodeOfLinkedList();
//        middleNodeOfLinkedList.insert(1);
//        middleNodeOfLinkedList.insert(3);
//        middleNodeOfLinkedList.insert(4);
//        middleNodeOfLinkedList.insert(7);
//        middleNodeOfLinkedList.insert(1);
//        middleNodeOfLinkedList.insert(2);
        ListNode head =  middleNodeOfLinkedList.insert(6);
        middleNodeOfLinkedList.show(head);
        ListNode newHead = middleNodeOfLinkedList.deleteMiddle(head);

        middleNodeOfLinkedList.show(newHead);



    }

}
