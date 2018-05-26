/**
 *
 */
package com.threading;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author dp250219
 *
 */
public class FizzBuzzThread extends Thread {
    private static Object lock = new Object();
    private int max;
    private int current = 1;
    private Predicate<Integer> validate;
    private Function<Integer, String> printer;

    public FizzBuzzThread(Predicate<Integer> validate, Function<Integer, String> printer, int n) {
        this.max = n;
        this.validate = validate;
        this.printer = printer;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                if (current > max) {
                    return;
                }

                if (validate.test(current)) {
                    System.out.println(printer.apply(current));
                    current++;
                }
            }
        }
    }
}
