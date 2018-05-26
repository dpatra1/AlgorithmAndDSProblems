/**
 *
 */
package com.diginsite.bbp.binarysearch;


/**
 * @author dp250219
 *
 */

public class BinarySearchProgram {


    public boolean binarySearch(int key, int[] args) {

        int lo = 0;
        int hi = args.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < args[mid]) {
                hi = mid - 1;
            } else if (key > args[mid]) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
