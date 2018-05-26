/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 *         Initialize: max_so_far = 0 max_ending_here = 0
 *
 *         Loop for each element of the array (a) max_ending_here =
 *         max_ending_here + a[i] (b) if(max_ending_here < 0) max_ending_here =
 *         0 (c) if(max_so_far < max_ending_here) max_so_far = max_ending_here
 *         return max_so_far
 */
public class KadaneAlgorithm {

    public static int maxContiguousSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxSoFar = arr[0];
        int maxEndHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndHere += arr[i];
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }

            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
            }
        }

        return maxSoFar;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        //System.out.println(maxContiguousSubArraySum(arr));

        int[] arr1 = { -2, -3, 4, -1, -2, 1, 5, -3, 2, -1 };
        System.out.println(maxContiguousSubArraySum(arr1));
    }

}
