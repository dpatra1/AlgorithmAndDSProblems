/**
 *
 */
package com.threading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dp250219
 *
 */
public class Chopstick {
    private Lock lock;

    public Chopstick() {
        lock = new ReentrantLock();
    }

    public void pickUp() {
        lock.lock();
    }

    public void putDown() {
        lock.unlock();
    }
}



