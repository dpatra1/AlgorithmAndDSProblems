/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class DoublyLinkedList {
    private DoublyLinkNode head;

    public void insertInHead(int key) {
        DoublyLinkNode doublyLinkNode = new DoublyLinkNode(key);
        doublyLinkNode.setNextNode(this.head);

        if (this.head != null) {
            this.head.setPreviousNode(doublyLinkNode);
        }
        this.head = doublyLinkNode;
    }

    public int length() {
        if(this.head == null){
            return 0;
        }

        DoublyLinkNode current = this.head;


        int cnt = 0;

        while (current != null) {
            cnt++;
            current = current.getNextNode();
        }
        return cnt;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        DoublyLinkNode current = this.head;
        while (current != null){
            strBuilder.append("Node Data: ");
            strBuilder.append(current);
            strBuilder.append("\n");
            current = current.getNextNode();
        }
        return strBuilder.toString();
    }

}
