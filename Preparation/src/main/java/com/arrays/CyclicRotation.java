/**
 *
 */
package com.arrays;

import java.util.HashMap;

/**
 * @author dp250219
 *
 */
public class CyclicRotation {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] A = { 1,2,3,4};


        int[] result = move(A, 2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println(move(A, 4));
    }

    public static int[] move(int[] A, int K) {
        int n = A.length;

        while(K > 0){
            int tmp = A[n-1];
            for(int i = n-1; i>0; i--){
                A[i] = A[i-1];
            }
            A[0] = tmp;
            K--;
        }
        return A;
    }

}
