/**
 *
 */
package com.test;

/**
 * @author dp250219
 *
 */
public class StringCompression {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String abc = "AABCCAAAAAAAAAADCCB";
        char[] charArray = abc.toCharArray();

        //compressFromLeetCode(charArray);
        //compress(charArray);
        System.out.println(compress(charArray));
        System.out.println(charArray);
    }

    /**
     * @param charArray
     */
    protected static int compressMy(char[] chars) {
        int count = 1;
        int nIndex = 0;
        int m = chars.length;
        for (int i = 0; i < m; i++) {
            if (i != m - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[nIndex++] = chars[i];
                if (count > 1) {
                    String cntStr = count + "";
                    int p = 0;
                    while (p < cntStr.length()) {
                        chars[nIndex++] = cntStr.charAt(p);
                        p++;
                    }
                }
                count = 1;
            }
        }
        return nIndex;
    }

    protected static int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }

    public static int compressFromLeetCode(char[] chars) {
        int count = 1;
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[j++] = chars[i];
                if (count != 1) {
                    String num = count+ "";
                    for (int k = 0; k < num.length(); k++) {
                        chars[j++] = num.charAt(k);
                    }
                }
                count = 1;
            }
        }
        return j;
    }
}
