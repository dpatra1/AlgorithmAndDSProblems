package com.towerofhanoi;
/**
 *
 */

/**
 * @author dp250219
 *
 */
public class TowerOfHanoi {

    /**
     * @param args
     */
    public static void main(String[] args) {
        move(5, 'A', 'C', 'B');
    }

    public static void move(int numberOfDisces, char from, char to, char inter) {
        if (numberOfDisces == 1) {
            System.out.println("Move from disc 1 from : " + from + " to :" + to);
        } else {
            move(numberOfDisces - 1, from, inter, to);
            System.out.println("Moving disc " + numberOfDisces + " from : " + from + " to :" + to);
            move(numberOfDisces - 1, inter, to, from);
        }
    }

}
