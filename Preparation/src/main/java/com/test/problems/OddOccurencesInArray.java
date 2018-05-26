/**
 *
 */
package com.test.problems;

import java.util.HashMap;

/**
 * @author dp250219
 *
 */
public class OddOccurencesInArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // int[] A = { 1, 2, 3, 4, 5};
         int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        // int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        // 0-2, 1-3, 4-6, 5-7

        System.out.println(getOddOccurrence(A, A.length));
    }

    // funtion to find the element occurring odd
    // number of times
    public static int getOddOccurrence(int arr[], int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        // Putting all elements into the HashMap
        for (int i = 0; i < n; i++) {
            if (hmap.containsKey(arr[i])) {
                int val = hmap.get(arr[i]);

                // If array element is already present then
                // increase the count of that element.
                hmap.put(arr[i], val + 1);
            } else

                // if array element is not present then put
                // element into the HashMap and initialize
                // the count to one.
                hmap.put(arr[i], 1);
        }

        // Checking for odd occurrence of each element present
        // in the HashMap
        for (Integer a : hmap.keySet()) {
            if (hmap.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }

    // This code is contributed by Kamal Rawal

}
