package com.diginsite.bbp.linklist;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) throws java.lang.Exception {
//        ReverseLinkedListIterative a = new ReverseLinkedListIterative();
//        a.addAtBegin(5);
//        a.addAtBegin(10);
//        a.addAtBegin(15);
//        a.addAtBegin(20);
//        a.addAtBegin(25);
//        a.addAtBegin(30);
//        a.display(a.head);
//        a.reverseIterative(a.head);
        ReverseLinkedListRecurrsive b = new ReverseLinkedListRecurrsive();
        b.addAtBegin(31);
        b.addAtBegin(32);
        b.addAtBegin(33);
        b.addAtBegin(34);
        b.addAtBegin(35);
        b.addAtBegin(36);
        System.out.println("");
        System.out.println("___________________");
        System.out.print("Original Link List 2 : ");
        b.display(b.head);
        b.reverseRecursion(b.head, b.head.next, null);
        System.out.println("");

        removeFromLast("A");
    }


    private static void removeFromLast(String s){
        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");

        boolean result = list.stream().anyMatch(v-> s.equals(v));
        System.out.println(result);
    }
}


