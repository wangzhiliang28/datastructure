package com.wangzhiliang.data.datastructure.offer35;

public class Solution {

    public Node copyRandomList(Node head) {

        //1
        Node newhead =new Node(head.val);
        //2
        head=head.next;
         //3
        while (head!=null){
            Node newnode =new Node(head.val);
            newnode.random=head.random;
            newnode.next=head.next;
            //4
            head=head.next;
            //5
            newhead.next=newnode;
        }
        return null;
    }


   static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


}
