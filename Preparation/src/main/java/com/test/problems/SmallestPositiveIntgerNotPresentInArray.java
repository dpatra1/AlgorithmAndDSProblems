package com.test.problems;

import java.util.HashSet;

class SmallestPositiveIntgerNotPresentInArray {
    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 4, 1, 2 };
        // System.out.println(solution(A));
        // int[] AA = { 1, 2, 3};

        // int[] AA = { -1, -2, -3};
        System.out.println(solution(A));

        // int[] AA = { -1, 4, -2, -3, 1};
    }

    public static int solution(int[] A) {
        int n = A.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (A[i] >= 0) {
                set.add(A[i]);
            }
        }
        int result = 1;

        while (set.contains(result)) {
            result++;
        }

        return result;
    }
}