package com.wsq.leetcode.easy;

import java.util.Arrays;

public class Num977 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int k = nums.length;
        int j = nums.length - 1;
        int[] result = new int[nums.length];
        while (i <= j) {
            int before = (int) Math.pow(nums[i], 2);
            int after = (int) Math.pow(nums[j], 2);

            if (before < after) {
                result[--k] = after;
                j--;
            } else {
                result[--k] = before;
                i++;
            }
        }

        return result;
    }
}
