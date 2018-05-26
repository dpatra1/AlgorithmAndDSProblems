package com.test;

import java.util.ArrayDeque;
import java.util.Deque;


public class PallindromCheck {

    public static void main(String[] args) {
        //PallindromDeque();
        PallindromString();
    }

    protected static void PallindromString() {
        String input = "RApuAR";


        int n = input.length();
        int startIndex = 0;
        int endIndex = n-1;
        boolean result = true;
        while(endIndex > startIndex){
            if(input.charAt(startIndex) != input.charAt(endIndex)){
                result = false;
                break;
            }
            startIndex ++;
            endIndex --;
        }
       System.out.println(result);
    }


    /**
     *
     */
    protected static void PallindromDeque() {
        Deque<String> input = new ArrayDeque<>();

        input.push("R");
        input.push("A");
        input.push("D");
        input.push("A");
        input.push("R");

        int n = input.size();

        int start = 0;
        int end = n-1;
        boolean result = true;
        while(end > start){
            if(input.pollFirst() != input.pollLast()){
                result = false;
            }
            end --;
            start ++;
        }
        System.out.println(result);
    }

}
