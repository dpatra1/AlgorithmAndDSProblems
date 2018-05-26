package com.test;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int value) {
        this.val = value;
        next = null;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }

            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }

            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry /= 10;
        }

        if (carry >= 1)
            p3.next = new ListNode(1);

        return newHead.next;
    }

    public void reverseIterative(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode = null;
        ListNode prevNode = null;

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

    public void reverseRecursion(ListNode ptrOne, ListNode ptrTwo, ListNode prevNode) {
        if (ptrTwo != null) {
            if (ptrTwo.next != null) {
                ListNode t1 = ptrTwo;
                ListNode t2 = ptrTwo.next;
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

    public void display(ListNode head) {
        //
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print("->" + currNode.val);
            currNode = currNode.next;
        }
    }

}