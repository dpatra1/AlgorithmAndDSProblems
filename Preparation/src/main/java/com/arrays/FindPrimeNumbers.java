/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 */
public class FindPrimeNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] argsArray = new int[6];
        argsArray[0] = 1;
        argsArray[1] = 4;
        argsArray[2] = 13;
        argsArray[3] = 5;
        argsArray[4] = 2;
        argsArray[5] = 3;
        printPrimes(argsArray);

    }

    public static void printPrimes(int[] array){
        for (int i = 0; i < array.length; i++) {
            int m = array[i]/2;
            int j = 2;
            boolean flag = true;
            while(j <= m){
                if(array[i]%j == 0){
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag){
                System.out.println(array[i]);
            }
        }
    }

}
