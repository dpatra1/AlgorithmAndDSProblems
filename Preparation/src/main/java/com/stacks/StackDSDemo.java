/**
 *
 */
package com.stacks;

/**
 * @author dp250219
 *
 */
public class StackDSDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        StackDS stackDS = new StackDS(5);
        stackDS.push(12);
        stackDS.push(23);
        stackDS.push(43);
        stackDS.push(21);
        //stackDS.push(45);

        System.out.println(stackDS);
        System.out.println(stackDS.length());
        System.out.println(stackDS.pop());
        System.out.println(stackDS);
        System.out.println(stackDS.length());
    }

}
