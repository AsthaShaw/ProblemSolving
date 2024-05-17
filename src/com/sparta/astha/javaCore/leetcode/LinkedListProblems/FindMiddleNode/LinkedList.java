package com.sparta.astha.javaCore.leetcode.LinkedListProblems.FindMiddleNode;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //my code to find the middle node

    public Node findMiddleNode(){
        int length=0;
        Node temp=head;

        while(temp!=null){
            temp=temp.next;
            length++;
        }

        int middle=length/2;
        Node middleNode=get(middle);
        return middleNode;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

   //way 2 more optimised- tortoise and hare problem

    public Node findMiddleNode2(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

}
