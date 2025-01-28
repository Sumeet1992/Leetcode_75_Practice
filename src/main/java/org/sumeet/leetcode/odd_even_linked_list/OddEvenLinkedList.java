package org.sumeet.leetcode.odd_even_linked_list;


public class OddEvenLinkedList {

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

public ListNode oddEvenList(ListNode head) {
    int counter = 1;
    ListNode oddHead = null;
    ListNode evenHead = null;
    ListNode odd = null;
    ListNode even = null;
    ListNode n = head;
    if (head == null) {
        return null;
    }
    while (n != null) {
        if (counter % 2 == 1) {
            if (counter == 1) {
                oddHead = new ListNode(n.val);
                odd = oddHead;
            } else {
                odd.next = n;
                odd = odd.next;
            }
        } else {
            if (counter == 2) {
                evenHead = new ListNode(n.val);
                even = evenHead;
            } else {
                even.next = n;
                even = even.next;
            }
        }
        n = n.next;
        counter++;
    }
    if (odd != null) {
        odd.next = evenHead;
    }
    if (even != null) {
        even.next = null;
    }
    return oddHead;
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
