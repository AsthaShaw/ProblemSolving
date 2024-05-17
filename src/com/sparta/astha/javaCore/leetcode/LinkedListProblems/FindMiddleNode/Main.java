package com.sparta.astha.javaCore.leetcode.LinkedListProblems.FindMiddleNode;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
       // linkedList.printList();

        System.out.println(linkedList.findMiddleNode().value);
        System.out.println(linkedList.findMiddleNode2().value);

    }
}
