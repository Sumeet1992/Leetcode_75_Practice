package org.sumeet.leetcode.odd_even_linked_list;

public class OddEvenLinkedListRunner {

    public static void main(String[] args) {
        OddEvenLinkedList list = new OddEvenLinkedList();
        list.insert(2);
        list.insert(1);
        list.insert(6);
        list.insert(5);
        list.insert(3);
        list.insert(4);
        ListNode h = list.insert(7);

        list.show(h);

        ListNode finalHead = list.oddEvenList(h);
        list.show(finalHead);

    }

}
