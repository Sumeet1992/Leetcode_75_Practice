package org.sumeet.leetcode.reverse_linked_list;

public class ReverseLinkedListRunner {

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.insert(1);
        reverseLinkedList.insert(2);
        reverseLinkedList.insert(3);
        reverseLinkedList.insert(4);
        ListNode head = reverseLinkedList.insert(5);

        reverseLinkedList.show(head);

        ListNode reverseHead = reverseLinkedList.reverseList(head);
        reverseLinkedList.show(reverseHead);
    }

}
