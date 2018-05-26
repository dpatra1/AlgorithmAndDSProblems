package com.priorityqueue;

import java.util.*;
import java.lang.*;
import java.io.*;

class SortArrayElementsDescendingOrder {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            int n = sc.nextInt();
            String s[] = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }
            // Arrays.sort(s,new check());
            Arrays.sort(s, new Comparator<String>() {
                public int compare(String x, String y) {
                    x = x + y;
                    y = y + x;
                    return x.compareTo(y);
                }
            });
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(s[i]);
            }
            System.out.println();

        }
    }

}