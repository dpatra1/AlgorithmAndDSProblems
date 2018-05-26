/**
 *
 */
package com.test.problems;

/**
 * @author dp250219
 *
 */
public class ConvertIntTOBinary {

    /**
     * @param args
     */
    public static void main(String[] args) {
        convertTOBinary(25);

    }

    public static String convertTOBinary(Integer n) {
        String result = "";
        while (n > 0) {
            int a = n % 2;
            result += a;
            n = n / 2;
        }
        System.out.println(result);

        char[] charArray = result.toCharArray();
        int cnt = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '1'){
                cnt++;
            }
        }
        return result;
    }
}
