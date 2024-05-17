package com.sparta.astha.javaCore.leetcode.LinkedListProblems;

public class HasLoopProblem {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    //My Leetcode solution
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            ListNode slow=head;
//            ListNode fast=head;
//
//            while(fast!=null && fast.next!=null){
//                slow=slow.next;
//                fast=fast.next.next;
//
//                if(slow==fast){
//                    return true;
//                }
//            }
//            return false;
//        }
//
//    }
}
