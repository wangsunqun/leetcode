package com.wsq.leetcode.easy;

import java.util.Arrays;

/**
 * 1480
 *
 * @author wsq
 * 2021/1/19 11:32
 */
public class Num1480 {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
