package com.test;

public class RotateAnArryBySpecificNumber {

    public static void main(String[] args) {
        String[] orgArray = {"1", "2", "3", "4", "5"};
        printArray(orgArray);
        System.out.println("------------------");
        movebyNumbersType1(orgArray, orgArray.length, 2);
    }


    static void movebyNumbersType1(String[] orgArray, int length, int number){
        String[] tempArray1 = new String[number];
        String[] tempArray2 = new String[length-number];
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if(i <= number){
                tempArray1[i] = orgArray[i];
                number--;
            }else{
                tempArray2[cnt] = orgArray[i];
                cnt++;
            }
        }


        System.out.println("Array1------------------");
        printArray(tempArray1);
        System.out.println("Array2------------------");
        printArray(tempArray2);

    }

    static void movebyNumbersType2(String[] orgArray, int length, int number){
        for (int i = 0; i < number; i++) {
            leftRotateByOne(orgArray, length);
        }
    }


    static void leftRotateByOne(String[] orgArray, int length){
        String temp = orgArray[0];
        for (int i = 0; i < length-1; i++) {
            orgArray[i] = orgArray[i+1];
        }
        orgArray[length-1] = temp;
    }

    private static void printArray(String[] orgArray){
        if(null != orgArray && orgArray.length != 0){
            for (int i = 0; i < orgArray.length; i++) {
                System.out.println(orgArray[i]+ "\n");
            }
        }
    }

}
