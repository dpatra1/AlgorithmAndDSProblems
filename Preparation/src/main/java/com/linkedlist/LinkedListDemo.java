/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class LinkedListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtHead(5);
//        linkedList.insertAtHead(10);
//        linkedList.insertAtHead(8);
//        linkedList.insertAtHead(12);
//        linkedList.insertAtHead(9);
//        linkedList.insertAtHead(7);
//        System.out.println(linkedList.toString());
//        System.out.println(linkedList.length());
//
//        linkedList.deleteFromHead();
//
//        System.out.println(linkedList.toString());
//        System.out.println(linkedList.length());
//        System.out.println("Found: " + linkedList.find(8));
//        System.out.println("Found: " + linkedList.find(15));
//
//        LinkedList sortedLinkedList = new LinkedList();
//
//        sortedLinkedList.insertAtHead(90);
//        sortedLinkedList.insertAtHead(80);
//        sortedLinkedList.insertAtHead(70);
//        sortedLinkedList.insertAtHead(60);
//        sortedLinkedList.insertAtHead(50);
//        sortedLinkedList.insertAtHead(40);
//        System.out.println(sortedLinkedList.toString());
//        sortedLinkedList.insertToSortedLinkedList(75);
//        System.out.println(sortedLinkedList.toString());

        LinkedList l1 = new LinkedList();
        l1.insertAtHead(8);
        l1.insertAtHead(1);
        l1.insertAtHead(8);
        l1.insertAtHead(1);
        //l1.insertAtHead(9);
        //l1.insertAtHead(7);

        LinkedList l2 = new LinkedList();
        l2.insertAtHead(5);
        l2.insertAtHead(1);
        l2.insertAtHead(8);
        //l2.insertAtHead(1);
        //l2.insertAtHead(9);
        //l2.insertAtHead(7);

        Node additionHead = linkedList.addTwoReversedLinkedLists(l1.insertAtHead(7), l2.insertAtHead(7));
        String result = "";
        while(additionHead != null){
            result += additionHead.getData();
            additionHead = additionHead.getNextNode();
        }
        System.out.println(result);
    }
  // 5187
 // 81817
 //------
 // 87004

//518197
// 81817
//------
//60014

//818197
//518197
//------
//1336394
//13363954
}
