package com.test;
/**
 *
 */

/**
 * @author dp250219
 *
 */
public class ReverseAnArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] strArray = new String[6];
        String[] initArray = {"1", "2", "3", "4", "5"};

        if(null == initArray || initArray.length == 0){
            return;
        }

        int startindex = 0;
        int endIndex = initArray.length -1;
        printArray(initArray);
        reverseArray(initArray, startindex, endIndex);
        System.out.println("==<=====>==");
        printArray(initArray);

        System.out.println("==<=====>==");

        String name = "DEBAPRIYA PATRA";
        char[] charArray = name.toCharArray();
        int charAStartindex = 0;
        int charAEndindex = charArray.length -1;
        System.out.println(name);
        reverseCharArray(charArray, charAStartindex, charAEndindex);
        System.out.println(new String(charArray));

    }

    private static void printArray(String[] orgArray){
        if(null != orgArray && orgArray.length != 0){
            for (int i = 0; i < orgArray.length; i++) {
                System.out.println(orgArray[i]+ "\n");
            }
        }
    }

    private static void reverseCharArray(char[] orgArray, int startindex, int endIndex){
        if(startindex >= endIndex){
            return;
        }
        char temp = orgArray[startindex];
        orgArray[startindex] = orgArray[endIndex];
        orgArray[endIndex] = temp;
        startindex ++;
        endIndex --;
        reverseCharArray(orgArray, startindex, endIndex);
    }

    private static void reverseArray(String[] orgArray, int startindex, int endIndex){
        if(startindex >= endIndex){
            return;
        }
        String temp = orgArray[startindex];
        orgArray[startindex] = orgArray[endIndex];
        orgArray[endIndex] = temp;
        startindex ++;
        endIndex --;
        reverseArray(orgArray, startindex, endIndex);
    }

}
