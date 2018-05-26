/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class DoublyLinkNode {
    private DoublyLinkNode nextNode;
    private DoublyLinkNode previousNode;
    private int data;

    public DoublyLinkNode(int data){
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
    }

    public DoublyLinkNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkNode previousNode) {
        this.previousNode = previousNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "Data: "+ this.data;
    }
}
