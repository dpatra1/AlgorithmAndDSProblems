/**
 *
 */
package com.test;

/**
 * @author dp250219
 *
 */
public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] intArray = { 10, 9, 12, 4, 13, 11 };
        sortInteger(intArray);
        printArray(intArray);

        String[] strArray = { "GeeksforGeeks", "Practice.GeeksforGeeks", "GeeksQuiz" };
        sortString(strArray);
        printArray(strArray);
    }

    /**
     * EVery loop it will swap the first two integers to make sure putting it in ascending order only.
     * @param args
     */
    public static void sortInteger(Integer[] args){
        int n = args.length;
        boolean isSwapped;
        for (int i = 0; i < n-1; i++) {
            isSwapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(args[j] > args[j+1]){
                    isSwapped = true;
                    int temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }


    public static void sortString(String[] args){
        int n = args.length;
        boolean isSwapped;
        for (int i = 0; i < n-1; i++) {
            isSwapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(args[j].compareTo(args[j+1]) > 0){
                    isSwapped = true;
                    String temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

    /* Function to print an array */
    static void printArray(Integer arr[])
    {
        for (int i=0; i < arr.length; i++)
            System.out.println("-->"+ arr[i] + "\n");

    }

    /* Function to print an array */
    static void printArray(String arr[])
    {
        for (int i=0; i < arr.length; i++)
            System.out.println("-->"+ arr[i] + "\n");

    }


}
