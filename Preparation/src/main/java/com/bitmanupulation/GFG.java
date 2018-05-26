package com.bitmanupulation;

class GFG {
    // function to reverse bits of a number
    public static int reverseBits(int n) {
        int rev = 0;

        // traversing bits of 'n'
        // from the right
        while (n > 0) {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int) (n & 1) == 1)
                rev ^= 1;

            // bitwise right shift
            // 'n' by 1
            n >>= 1;
        }
        // required number
        return rev;
    }

    public static int generateBits(int n) {
        int rev = 0;

        while (n != 1) {
            n >>= 1;
        }
        return rev;
    }

    // Driver code
    public static void main(String[] args) {
        int n = 13;
        generateBits(13);
        System.out.println(reverseBits(n));
    }
}