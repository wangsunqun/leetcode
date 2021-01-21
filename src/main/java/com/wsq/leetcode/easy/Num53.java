package com.wsq.leetcode.easy;

/**
 * @author wsq
 * 2021/1/21 10:09
 */
public class Num53 {
    // 动态规划，适用于找啥最长子串等题目
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pre = 0;
        for (int num : nums) {
            // 到每个节点的最大子串合
            pre = Math.max(pre + num, num);
            // 跟最大的比较
            max = Math.max(pre, max);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
