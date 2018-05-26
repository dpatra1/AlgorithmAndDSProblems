package com.diginsite.bbp.linklist;

public class ReverseLinkedListIterative {
    public Node head;

    public ReverseLinkedListIterative() {
        head = null;
    }

    public void addAtBegin(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void reverseIterative(Node head) {
        Node currNode = head;
        Node nextNode = null;
        Node prevNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        System.out.println("\n Reverse Through Iteration");
        display(head);
    }

    public void display(Node head) {
        //
        Node currNode = head;
        while (currNode != null) {
            System.out.print("->" + currNode.data);
            currNode = currNode.next;
        }
    }
}