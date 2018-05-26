/**
 *
 */
package com.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dp250219
 *
 */
public class StringPermutationIsPalindrom {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public boolean isPermutationPalindrome(String text) {
        char[] charArray = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            map.put(c, map.getOrDefault(charArray, 0));
        }
        int total = 0;
        for (char c: map.keySet()) {
            total = total + map.get(c);
        }

        return false;
    }

}
