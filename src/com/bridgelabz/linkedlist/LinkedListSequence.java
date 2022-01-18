package com.bridgelabz.linkedlist;

public class LinkedListSequence {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Data Structure Problem using Java Generics");

        LinkedList linkedList = new LinkedList();

//        linkedList.insertFirst(70);  // insert 70 in LinkedList
//        linkedList.insertFirst(30);  // insert 50 in LinkedList
//        linkedList.insertFirst(56);  // insert 36 in LinkedList

        linkedList.insertLast(70);  // insert 70 in LinkedList from last
        linkedList.insertLast(30);  // insert 50 after 70 in LinkedList from last
        linkedList.insertLast(56);  // insert 36 after 50 in LinkedList from last

        linkedList.showLinkedList();       //showing added data in Linked List
    }
}
