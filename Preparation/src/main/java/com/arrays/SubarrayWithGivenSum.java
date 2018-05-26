/**
 *
 */
package com.arrays;

/**
 * @author dp250219
 *
 */
public class SubarrayWithGivenSum {

    public static int sumTotal(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i + 1; j <= arr.length; j++) {
                if (sum == target) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i + " and " + p);
                    return 1;
                }

                if (sum > target || j == arr.length) {
                    break;
                }
                sum += arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int target = 23;
        sumTotal(arr, target);
    }

}
