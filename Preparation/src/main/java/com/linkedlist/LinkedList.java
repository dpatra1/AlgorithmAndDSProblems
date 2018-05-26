/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class LinkedList {
    private Node head;


    public boolean isPalindrom(){
        return false;
    }

    public Node addTwoReversedLinkedLists(Node l1, Node l2) {
        int carry = 0;
        Node result = new Node(0);
        Node p1 = l1, p2 = l2;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.getData();
                p1 = p1.getNextNode();
            }

            if (p2 != null) {
                carry += p2.getData();
                p2 = p2.getNextNode();
            }
            result = insertAtHead(carry % 10);
            carry /= 10;
        }

        if (carry == 1) {
            result = insertAtHead(1);
        }
        return result;
    }

    public Node insertAtHead(int key) {
        Node newNode = new Node(key);
        newNode.setNextNode(this.head);
        this.head = newNode;
        return this.head;
    }

    public int length() {
        int cnt = 0;
        Node current = this.head;
        while (current != null) {
            cnt++;
            current = current.getNextNode();
        }
        return cnt;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node find(int key) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == key) {
                break;
            }
            current = current.getNextNode();
        }
        return current;
    }

    public void insertToSortedLinkedList(int key) {
        Node current = this.head;
        Node newNode = new Node(key);
        if (current == null) {

        }
        while (current != null) {
            if (current.getNextNode().getData() > key) {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
                break;
            }
            current = current.getNextNode();
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = head;
        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
