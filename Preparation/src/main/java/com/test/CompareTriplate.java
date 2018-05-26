package com.test;

import java.io.*;
import java.util.*;

public class CompareTriplate {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int alice = 0;
        int bob = 0;

        if (a0 > b0) {
            alice++;
        } else if(a0 < b0){
            bob++;
        }

        if (a1 > b1) {
            alice++;
        } else if(a1 < b1){
            bob++;
        }

        if (a2 > b2) {
            alice++;
        } else if(a2 < b2){
            bob++;
        }

        int[] result = new int[2]; // Alice and Bob
        result[0] = alice;
        result[1] = bob;

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] result = solve(5, 6, 7, 3, 6, 10);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
        }

    }
}
