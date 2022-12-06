package com.wangzhiliang.data.datastructure.offer06;

import java.util.LinkedList;
import java.util.Stack;

class Solution {


    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        int len=1;
        while (head!=null){
            stack.push(head);
            len++;
            head=head.next;
        }
        int[] sun=new int[len];


        int i=0;
        while (!stack.isEmpty()){
            sun[i]=stack.pop().val;
            i++;
        }

        return sun;

    }


   static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
