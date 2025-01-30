package org.sumeet.leetcode.maximum_twin_sum_of_linked_list;

public class MaxTwinSumLLRunner {

    public static void main(String[] args) {
        MaximumTwinSumOfLinkedList twinSumOfLinkedList = new MaximumTwinSumOfLinkedList();
        twinSumOfLinkedList.insert(5);
        twinSumOfLinkedList.insert(4);
        twinSumOfLinkedList.insert(2);
        ListNode head = twinSumOfLinkedList.insert(1);

        System.out.println(twinSumOfLinkedList.pairSum(head));
    }
}
