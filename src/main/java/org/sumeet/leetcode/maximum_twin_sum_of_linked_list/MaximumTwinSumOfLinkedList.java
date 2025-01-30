package org.sumeet.leetcode.maximum_twin_sum_of_linked_list;


public class MaximumTwinSumOfLinkedList {

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

    public int pairSum(ListNode head) {

        ListNode reverseLLHead = null;
        ListNode n = head;
        int size = 0;

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
            size++;
        }
        int maxTwinSum = head.val + reverseLLHead.val;
        ListNode list = head.next;
        ListNode reverseList = reverseLLHead.next;
        for(int i = 0; i<(size/2)-1; i++){
            int sum = 0;
            sum = list.val + reverseList.val;
            if(sum > maxTwinSum){
                maxTwinSum = sum;
            }
            list = list.next;
            reverseList = reverseList.next;
        }

        return maxTwinSum;

    }

}
