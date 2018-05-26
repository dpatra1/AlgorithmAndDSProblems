/**
 *
 */
package com.stacks;

import java.util.Stack;

/**
 * @author dp250219
 *
 */
public class SortAStackWithSmallAreOnTop {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sortTheStack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }

    }

    public static Stack<Integer> sortTheStack(Stack<Integer> inStack) {

        Stack<Integer> tmpStack = new Stack<>();

        while (!inStack.isEmpty()) {
            int tmp = inStack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                inStack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

}
