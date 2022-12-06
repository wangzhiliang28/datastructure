package com.wangzhiliang.data.datastructure.offer24;

public class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode next=head.next;
     ListNode temp;
     next.next=head;

     return head;

    }



    static  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
