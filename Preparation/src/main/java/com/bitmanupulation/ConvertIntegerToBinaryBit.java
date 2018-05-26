/**
 *
 */
package com.bitmanupulation;

import java.util.BitSet;
import java.util.function.BinaryOperator;

/**
 * @author dp250219
 *
 */
public class ConvertIntegerToBinaryBit {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int num = 11;
        System.out.println(num);
        String result = "";
        String reverseResult = "";
        int pos = 0;
        while (num > 0) {
            int tmp = num % 2;

            result = result + tmp;

            reverseResult = tmp + reverseResult;
            num = num / 2;
        }




        System.out.println(result);
        System.out.println(reverseResult);

        System.out.println("Integer To Binar : "+ Integer.toBinaryString(11));
        System.out.println("Integer To Binar : "+ Integer.toBinaryString(13));

        int p = 11 << 1;
        System.out.println("Integer To Binar 1 : "+ p);


    }
}
