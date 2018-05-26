/**
 *
 */
package com.queues;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author dp250219
 *
 */
public class QueueDS {
    private int maxSize;
    private int[] intArray;
    private int head = -1;
    private int tail = -1;

    public QueueDS(int maxSize) {
        this.maxSize = maxSize;
        intArray = new int[maxSize];
    }

    public void enqueue(int data) {
        if(this.tail == maxSize-1){
            return;
        }

        if(this.tail == -1 && this.head == -1){
            this.head++;
            this.tail++;
            intArray[this.tail] = data;
            return;
        }

        if(! (Math.abs(this.tail - this.head) < intArray.length)){
            System.out.println("Queue has no space to insert object");
            return;
        }

        if(this.tail+1 == maxSize){
            this.tail = 0;
        }

        this.tail++;
        intArray[this.tail] = data;
    }

    public int dequeue() {
        if (head < 0) {
            System.out.println("Queue is already empty.");
            return -1;
        }
        int result = intArray[this.head];
        this.intArray = ArrayUtils.remove(this.intArray, this.head);
        this.tail --;
        return result;
    }

    public int peek(){
        if(head == -1){
            System.out.println("Queue is empty.");
        }
        return intArray[head];
    }

    public int length() {
        int cnt = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 0){
                continue;
            }
            cnt++;
        }
        return cnt;
    }

    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                continue;
            }
            result += intArray[i] + ", ";
        }
        result += "}";
        return result;
    }

}
