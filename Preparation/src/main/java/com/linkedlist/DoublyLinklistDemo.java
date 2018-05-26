/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class DoublyLinklistDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertInHead(12);
        doublyLinkedList.insertInHead(13);
        doublyLinkedList.insertInHead(14);
        doublyLinkedList.insertInHead(15);
        doublyLinkedList.insertInHead(16);
        System.out.println(doublyLinkedList);

        System.out.println(doublyLinkedList.length());
    }

}
