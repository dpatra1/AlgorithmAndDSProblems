/**
 *
 */
package com.stacks;


import org.apache.commons.lang3.ArrayUtils;

/**
 * @author dp250219
 *
 */
public class StackDS {
    private int maxSize;
    private Integer[] intArray;
    private int head = -1;

    public StackDS(int maxSize){
        this.maxSize = maxSize;
        intArray = new Integer[maxSize];
    }

    public void push(int data){
        if(head == maxSize){
            System.out.println("Can not add, as the stack is already full.");
        }
        head++;
        this.intArray[head] = data;
    }

    public int peek(){
        if(head == -1){
            System.out.println("Stack is empty.");
        }
        return intArray[head];
    }

    public int pop(){
        if(head == -1){
            System.out.println("Stack is empty.");
        }
        int result = intArray[this.head];
        this.intArray = ArrayUtils.remove(this.intArray, this.head);
        this.head--;
        return result;
    }

    public int length(){
        int cnt = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == null){
                continue;
            }
            cnt++;
        }
        return cnt;
    }

    @Override
    public String toString(){
        String result = "{";
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == null){
                continue;
            }
            result += intArray[i] + ", ";
        }
        result += "}";
        return result;
    }

}
