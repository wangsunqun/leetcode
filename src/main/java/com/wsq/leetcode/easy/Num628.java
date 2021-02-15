package com.wsq.leetcode.easy;

import java.util.Arrays;

public class Num628 {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));
    }

    public static int maximumProduct(int[] nums) {
        int start = nums[0] * nums[1] * nums[2];
        if (nums.length == 3) return start;

        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[nums.length -1],
                nums[nums.length -1] * nums[nums.length -2] * nums[nums.length -3]);
    }
}
