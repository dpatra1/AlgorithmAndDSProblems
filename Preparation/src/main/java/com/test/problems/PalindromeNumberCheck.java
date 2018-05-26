package com.test.problems;

public class PalindromeNumberCheck {

    public static void main(String[] args) {
        //System.out.println(isPalindrome1(123));
        //System.out.println(isPalindrome1(-121));
        System.out.println(isPalindrome1(121));

        //System.out.println(isPalindrome2(-1221));
    }

    public static boolean isPalindrome1(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a
        // palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit
        // by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we
        // get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always
        // equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static boolean isPalindrome2(int x) {
        String value = Integer.toString(x);
        char[] chars = value.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i<=j){
            if(chars[i] != chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}