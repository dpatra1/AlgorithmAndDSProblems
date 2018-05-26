package com.arrays;

public class AddTwoValuesInAnArrayShouldMatchGivenTarget {
    public static void main(String[] args) {
        //int[] reqArray = { 1, 2, 3, 4, 9 };
        int[] reqArray = { 2,7,11,15};
        int[] twoSum = twoSum(reqArray, 9);

        System.out.println(twoSum[0]);
        System.out.println(twoSum[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] result = new int[2];

        if (nums.length == 1) {
            return result;
        }
        for (int i = 0; i<n; i++){
            for (int j = n-1; j>0; j--){
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
