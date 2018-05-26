/**
 *
 */
package com.threading;

/**
 * @author dp250219
 *
 */
public class Philosopher extends Thread {
    private int bites = 10;
    private Chopstick left, right;

    public Philosopher(Chopstick chopstickLeft, Chopstick chopstickRight) {
        this.left = chopstickLeft;
        this.left = chopstickRight;
    }

    public void eatFood() {
        pickup();
        chew();
        putdown();
    }

    public void pickup() {
        left.pickUp();
        right.pickUp();
    }

    public void putdown() {
        left.putDown();
        right.putDown();
    }

    public void chew() {

    }

    public void run() {
        for (int i = 0; i < bites; i++) {
            eatFood();
        }
    }

}
