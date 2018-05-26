package com.diginsite.bbp.tool;

import java.math.BigDecimal;

public class MAIN {

    public static void main(String[] args) {


        Integer N = 12;
        String s = "";

        for(int i = N; i>0; i /=2){

        }


        while (n >= 2) {
            s = (n % 2) + s;
            n = n / 2;
            if(n == 1){
                s = n +s ;
            }
        }
        System.out.println(s);

        // String s = "";
        // Integer N = 12;
         for (int n = N; n > 0; n /= 2){
         int temp1 = n/2;
         int temp = n % 2;
         s = (n % 2) + s;
         }
        // System.out.println(s);
        //
        // String binaryString = Integer.toBinaryString(12);
        // System.out.println(binaryString);

    }

    static void check(double x, double y) {
        if ((x > 0 && x < 1) && (y > 0 && y < 1)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

}
