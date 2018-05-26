/**
 * EVery move it finds the minimum element in the array and puts it on the front
 */
package com.test;

/**
 * @author dp250219
 *
 */
public class SelectionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //String[] strArray = { "GeeksforGeeks", "Practice.GeeksforGeeks", "GeeksQuiz" };
        //sortString(strArray);
        //printArray(strArray);

        Integer[] intArray = { 10, 9, 12, 4, 13, 11 };
        //sortInteger(intArray);
        selectionSort(intArray);
        printArray(intArray);
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

    // Sort a String array using selection sort.
    //lexicographic ordering
    public static void sortString(String[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    minIndex = j;
                }
            }

            String temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    // Sort a String array using selection sort.
    public static void sortInteger(Integer[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    static void selectionSort(Integer[] A){
        for (int i = 0; i < A.length - 1; i++) {
            int min = i;
            int j = i+1;
            while(j < A.length){
                if(A[j] < A[min]){
                    min = j;
                }
                j++;
            }
            if(min != i){
                int temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
    }


}
