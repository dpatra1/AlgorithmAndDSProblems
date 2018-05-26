package com.diginsite.bbp.linklist;

public class ReverseLinkedListRecurrsive {
    public Node head;

    public ReverseLinkedListRecurrsive() {
        head = null;
    }

    public void addAtBegin(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void reverseRecursion(Node ptrOne, Node ptrTwo, Node prevNode) {
        if (ptrTwo != null) {
            if (ptrTwo.next != null) {
                Node t1 = ptrTwo;
                Node t2 = ptrTwo.next;
                ptrOne.next = prevNode;
                prevNode = ptrOne;
                reverseRecursion(t1, t2, prevNode);
            } else {
                ptrTwo.next = ptrOne;
                ptrOne.next = prevNode;
                System.out.println("\n Reverse Through Recursion");
                display(ptrTwo);
            }
        } else if (ptrOne != null) {
            System.out.println("\n Reverse Through Recursion");
            display(ptrOne);
        }
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