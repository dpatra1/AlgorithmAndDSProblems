/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class DoublyEndedListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DoublyEndedList dList = new DoublyEndedList();

        dList.insertAtTail(12);
        dList.insertAtTail(19);
        dList.insertAtTail(15);
        dList.insertAtTail(13);

        System.out.println(dList);
    }

}
