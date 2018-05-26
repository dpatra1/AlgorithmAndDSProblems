/**
 *
 */
package com.test;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author dp250219
 *
 */
public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        int posCnt = 0;
        int negCnt = 0;
        int zeroCnt = 0;
        int total = arr.length;
        for (int i = 0; i < total; i++) {
            if (arr[i] > 0) {
                posCnt++;
            } else if (arr[i] < 0) {
                negCnt++;
            } else {
                zeroCnt++;
            }
        }

        System.out.println("POSITIVE: " + posCnt / total);
        System.out.println("NEGATIVE: " + negCnt / total);
        System.out.println("ZEROS: " + zeroCnt / total);
    }


    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = -4;
        arr[1] = 3;
        arr[2] = -9;
        arr[3] = 0;
        arr[4] = 4;
        arr[5] = 1;


        plusMinus(arr);
    }

}
