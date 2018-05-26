package com.diginsite.bbp.tool;

public class ReverseAString {
    public static void main(String[] args) {
        //calc("BAC");
        subString("DI01374_sdkfgh9843nfs_123456967.ach");
    }

    public static void calc(String str) {
        int n = str.length() - 1;
        char[] carr = str.toCharArray();

        int sum = carr[n] - 'A' + 1;
        n--;
        int i = 1;
        while (n >= 0) {
            sum += (carr[n] - 'A' + 1) * (int) Math.pow(26, i);
            n--;
            i++;
        }
        System.out.println(sum);
    }

    public static void subString(String fileName) {
        String partialSearchFileName = fileName.substring(0, fileName.lastIndexOf("_") + 1).concat("*");
        System.out.println(partialSearchFileName);
    }
}
