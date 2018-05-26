package com.diginsite.bbp.linklist;

public class InsertIntoSortedList {
    Node head;
    Node SortedInsert(Node head,int data) {
      if (head == null) {
          head = new Node(data);
      }
      else if (head.data >= data) {
          Node child = new Node(data);
          child.next = head;
          head = child;
      }
      else {
          Node current = head;
          while (current.next != null && current.next.data <= data) {
              current = current.next;
          }

          Node child = new Node(data);
          child.next = current.next;
          current.next = child;
      }

      return head;
    }
    public static void main(String[] args) {

    }

}
