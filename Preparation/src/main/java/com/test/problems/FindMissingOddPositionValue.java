package com.test.problems;
class FindMissingOddPositionValue {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9};
        solution(A);
    }
    public static int solution(int[] A) {
        int n = A.length;
        if(n == 1){
            return 0;
        }
        int i = 1;
        int result = 0;
        while(i < n){
            if( i+2 >= n){
                result = A[i];
                break;
            }
            i += 4;
        }
        return result;
    }
}