package org.sumeet.leetcode.reverse_linked_list;


public class ReverseLinkedList {

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

    public ListNode reverseList(ListNode head) {

        ListNode reverseLLHead = null;
        ListNode n = head;
        while(n != null){
            if(reverseLLHead == null){
                reverseLLHead = new ListNode(n.val);
            }
            else{
                ListNode temp = reverseLLHead;
                reverseLLHead = new ListNode(n.val);
                reverseLLHead.next = temp;
            }
            n = n.next;
        }
        return reverseLLHead;
    }

    public void show(ListNode head) {

        ListNode temp = head;
        if (head != null) {
            while (temp.next != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }

}
