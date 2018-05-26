/**
 *
 */
package com.diginsite.bbp.linklist;

import java.util.Stack;

/**
 * @author dp250219
 *
 */
public class LinkedListPalindrom {

    public boolean isPalindrom(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
