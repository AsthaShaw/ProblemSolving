package com.sparta.astha.javaCore.leetcode.LinkedListProblems.FindMiddleNode;

public class FindTheMiddleNodeLeetCode {

    public class ListNode {

        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

//way 1-my solution
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;

        while(temp!=null){
            temp=temp.next;
            length++;
        }

        int middle=length/2;
        ListNode middleNode=get(middle, head);
        return middleNode;
    }

    public ListNode get(int index, ListNode head){
        ListNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }


    //way 2-using Tortoise and Hare Problem-more optimised solution

    public ListNode middleNode2(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    }


