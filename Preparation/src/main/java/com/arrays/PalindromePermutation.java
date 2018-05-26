/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 */
public class PalindromePermutation {

    /**
     * @param args
     */
    public static void main(String[] args) {
        canPermutePalindrome("carerac");
    }

    public static boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
            System.out.println("-----" + map[s.charAt(i)]);
        }
        int count = 0;
        for (int key = 0; key < map.length && count <= 1; key++) {
            count += map[key] % 2;
            System.out.println("-----" + count);
        }
        return count <= 1;
    }
}
