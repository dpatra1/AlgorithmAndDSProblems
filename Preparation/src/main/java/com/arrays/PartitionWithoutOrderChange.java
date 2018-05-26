/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 */
public class PartitionWithoutOrderChange {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {0, 5, 10, 0, 15, 0};
        moveZerosTowardsEnd(arr1, arr1.length);
        System.out.println("----------");
        int[] arr2 = {0, 5, 10, 0, 15, 0};
        moveZerosTowardsFront(arr2, arr2.length);
    }

    /**
     * @param arr
     * @param i
     * @param length
     */
    protected static void moveZerosTowardsFront(int[] arr, int length) {
        int i = length-1;
        for (int j = length-1; j >= 0 ; j--) {
            if(arr[j] != 0){
                arr[i--] = arr[j];
            }
        }

        while(i >= 0){
            arr[i--] = 0;
        }

        for (int j = 0; j < length; j++) {
            System.out.println(arr[j] + ",");
        }
    }


    /**
     * @param arr
     * @param i
     * @param length
     */
    protected static void moveZerosTowardsEnd(int[] arr, int length) {
        int i =0;
        for (int j = 0; j < length; j++) {
            if(arr[j] != 0){
                arr[i++] = arr[j];
            }
        }

        while(i < length){
            arr[i++] = 0;
        }

        for (int j = 0; j < length; j++) {
            System.out.println(arr[j] + ",");
        }
    }

}
