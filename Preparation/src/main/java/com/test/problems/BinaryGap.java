package com.test.problems;

import java.util.Arrays;
import java.util.List;

class BinaryGap {

    public static void main(String[] args) {
        solution(561892);
        solution(74901729);
        solution(1376796946);
    }

    public static int solution(int N) {
        System.out.println("Number: " + N);
        String result = "";
        while (N > 0) {
            int bi = N % 2;
            result = bi + result;
            N = N / 2;
        }

        char[] arr = result.toCharArray();
        int hightRepeatedZeros = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                tmp++;
            } else {
                if (tmp > hightRepeatedZeros) {
                    hightRepeatedZeros = tmp;
                }
                tmp = 0;
            }
        }
        System.out.println("Binary: " + result + ", HighestConsecutiveZero: " + hightRepeatedZeros);
        
        return hightRepeatedZeros;
    }
}