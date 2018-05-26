/**
 *
 */
package com.diginsite.bbp.linklist;

import com.linkedlist.Node;

/**
 * @author dp250219
 *
 */
public class AddTwoLinkedListNumbers {
    private Node head;

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

}
