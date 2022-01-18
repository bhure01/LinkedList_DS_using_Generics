package com.bridgelabz.linkedlist;

// UC1-create a simple Linked List of 56, 30 and 70//

public class Node {
    private int data;
    private Node next;

    //created a Node constructor for creating a new Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    // now inserting data in new Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
    }
}

