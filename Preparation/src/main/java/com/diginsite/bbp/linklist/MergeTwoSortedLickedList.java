/**
 *
 */
package com.diginsite.bbp.linklist;

/**
 * @author dp250219
 *
 */
public class MergeTwoSortedLickedList {

    public Node mergeSortedLinkedLsit(Node n1, Node n2){
        Node result = null;
        if(n1 == null){
            return result;
        }

        if(n2 == null){
            return result;
        }

        if(n1.data < n2.data){
            result = n1;
            result.next = mergeSortedLinkedLsit(n1.next, n2);
        }else{
            result = n2;
            result.next = mergeSortedLinkedLsit(n1, n2.next);
        }
        return result;
    }
}
