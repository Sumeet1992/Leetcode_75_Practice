package org.sumeet.leetcode.delete_middle_node_of_linkedList;

import org.sumeet.linkedlist.Node;

public class DeleteMiddleNodeOfLinkedList {

    ListNode hd;

    public ListNode insert(int data){

        ListNode n = new ListNode(data);
        if(hd == null){
            hd = n;
        }
        else{
            ListNode temp = hd;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }

        return hd;

    }

    public ListNode deleteMiddle(ListNode head) {

        ListNode n = head;
        ListNode nodeToBeDeleted = null;
        int i = 1;
        while(n.next != null){
            n = n.next;
            i++;
        }
        int middleIndex = i/2;
        n = head;
        for(int j = 0; j<middleIndex-1; j++){
            n = n.next;
        }

        if(i == 1){
            head = null;
        }
        else {
            nodeToBeDeleted = n.next;
            n.next = nodeToBeDeleted.next;
            nodeToBeDeleted = null;
        }
        return head;

    }

    public void show(ListNode head){

        ListNode temp = head;
        if(head != null){
            while(temp.next != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }


    }

}
