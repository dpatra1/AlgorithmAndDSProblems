/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int key) {
        Node newNode = new Node(key);
        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
