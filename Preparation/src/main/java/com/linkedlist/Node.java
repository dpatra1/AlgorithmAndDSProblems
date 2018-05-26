/**
 *
 */
package com.linkedlist;

/**
 * @author dp250219
 *
 */
public class Node {
    private int data;
    private Node nextNode;
    public void setData(int data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public int getData() {
        return this.data;
    }
    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "Data: "+ this.data;
    }
}


