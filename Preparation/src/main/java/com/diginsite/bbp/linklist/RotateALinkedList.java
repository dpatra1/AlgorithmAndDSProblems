/**
 *
 */
package com.diginsite.bbp.linklist;

/**
 * @author dp250219
 *
 */
public class RotateALinkedList {
     public Node head;

        public RotateALinkedList() {
            head = null;
        }

        public void rotate(Node head, int k) {
            Node curr = head;
            Node prev = curr;
            Node kthNode = null;

            while(curr != null){
                k--;
                if(k == 0){
                    kthNode = curr;
                }
                prev = curr;
                curr = curr.next;
            }

            prev.next = head;
            head = kthNode.next;
            kthNode.next = null;

        }

        public void display(Node head) {
            //
            Node currNode = head;
            while (currNode != null) {
                System.out.print("->" + currNode.data);
                currNode = currNode.next;
            }
        }

}
