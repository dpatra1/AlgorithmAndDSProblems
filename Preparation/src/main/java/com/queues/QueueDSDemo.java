/**
 *
 */
package com.queues;


/**
 * @author dp250219
 *
 */
public class QueueDSDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        QueueDS queueDS = new QueueDS(5);
        queueDS.enqueue(12);
        queueDS.enqueue(23);
        queueDS.enqueue(43);
        queueDS.enqueue(21);
        queueDS.enqueue(45);
        //queueDS.enqueue(37);

        System.out.println(queueDS);
        System.out.println(queueDS.length());
        System.out.println(queueDS.peek());
        System.out.println(queueDS.dequeue());
        System.out.println(queueDS.peek());
        System.out.println(queueDS);
        System.out.println(queueDS.length());
        //queueDS.enqueue(57);
        //System.out.println(queueDS);
        //System.out.println(queueDS.length());
    }

}
