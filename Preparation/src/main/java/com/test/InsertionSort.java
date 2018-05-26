package com.test;

public class InsertionSort {

    public static void main(String[] args) {
        Integer[] org = { 11, 10, 12, 5, 3, 9, 8, 16 };
         insertionSortIterativeV2(org);
        // insertionSortRecurrsiveVersion(org, org.length);
        printArray(org);
    }

    static void insertionSortIterativeV1(Integer[] org) {
        for (int i = 1; i < org.length; i++) {
            int j = i;
            while (j > 0 && org[j - 1] > org[j]) {
                int temp = org[j - 1];
                org[j - 1] = org[j];
                org[j] = temp;
                j = j - 1;
            }
            printArray(org);
        }
    }

    // { 11, 10, 12, 5, 3, 9, 8, 16 };
    static void insertionSortIterativeV2(Integer[] org) {
        for (int i = 1; i < org.length; i++) {
            int j = i - 1;
            int key = org[i];
            while (j >= 0 && org[j] > key) {
                org[j + 1] = org[j];
                j = j - 1;
            }
            org[j + 1] = key;
            printArray(org);
        }
    }

    static void insertionSortRecurrsiveVersion(Integer[] org, int n) {
        if (n <= 1) {
            return;
        }

        insertionSortRecurrsiveVersion(org, n - 1);
        int j = n - 2;
        int key = org[n - 1];
        while (j >= 0 && org[j] > key) {
            org[j + 1] = org[j];
            j = j - 1;
        }
        org[j + 1] = key;
    }

    private static void printArray(Integer[] orgArray) {
        if (null != orgArray && orgArray.length != 0) {
            System.out.println(orgArray[0] + "," + orgArray[1] + "," + orgArray[2] + "," + orgArray[3] + ","
                    + orgArray[4] + "," + orgArray[5] + "," + orgArray[6] + "," + orgArray[7]);
        }
    }

}
