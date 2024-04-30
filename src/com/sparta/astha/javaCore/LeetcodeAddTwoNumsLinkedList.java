package com.sparta.astha.javaCore;


import java.util.ArrayList;
import java.util.List;

public class LeetcodeAddTwoNumsLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> nums1 = new ArrayList<Integer>();
        List<Integer> nums2 = new ArrayList<Integer>();
        ListNode l3=new ListNode();
        int number1=0;
        int number2=0;
        int reversedNumber=0;

        long finalValue=0;
        while (l1.next != null) {

            nums1.add(l1.val);
            l1=l1.next;

        }
        nums1.add(l1.val);

        while (l2.next != null) {

            nums2.add(l2.val);
            l2=l2.next;

        }
        nums2.add(l2.val);

       for(int digit: nums1.reversed()){
           number1=10*number1 + digit;
       }

        for(int digit: nums2.reversed()){
            number2=10*number2 + digit;
        }

        int finalNumber=number1+number2;

        while(finalNumber!=0){
            int rem=finalNumber%10;
            l3.val=rem;
            l3.next=new ListNode();
            //reversedNumber=reversedNumber*10+rem;
            finalNumber=finalNumber/10;

        }
        l3.next=null;

//        System.out.println(reversedNumber);
//
//        while(reversedNumber!=0){
//            int rem=reversedNumber%10;
//
//        }


        return l3;
    }
}



