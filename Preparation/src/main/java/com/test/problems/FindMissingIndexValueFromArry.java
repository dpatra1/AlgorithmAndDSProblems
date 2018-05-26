/**
 *
 */
package com.test.problems;

/**
 * @author dp250219
 *
 */
public class FindMissingIndexValueFromArry {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 4;
        A[2] = 6;
        A[3] = 7;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int n = A.length;
        if(n == 0){
            return 0;
        }
        for(int i =0; i < n; i++){
            if(A[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
