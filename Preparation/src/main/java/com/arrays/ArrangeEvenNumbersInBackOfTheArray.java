/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 */
public class ArrangeEvenNumbersInBackOfTheArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] argsArray = new int[6];
        argsArray[0] = 1;
        argsArray[1] = 4;
        argsArray[2] = 7;
        argsArray[3] = 9;
        argsArray[4] = 2;
        argsArray[5] = 8;
        int[] arrangedArray = arrange(argsArray);
        for (int i = 0; i < arrangedArray.length; i++) {
            System.out.println(arrangedArray[i] +"\n");
        }
    }

    public static int[] arrange(int[] intArray) {

        int cnt = -1;
        if (null == intArray || intArray.length == 0) {
            return intArray;
        }

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]%2 == 0){
                if(i == 0){
                    cnt++;
                }else{
                    cnt++;
                    int tmp = intArray[i];
                    intArray[i] = intArray[cnt];
                    intArray[cnt]  = tmp;
                }
            }
            System.out.println(intArray);
        }

        return intArray;
    }

}
