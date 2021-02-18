package com.wsq.leetcode.easy;

public class Num1550 {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,12}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) return false;

        int count = 0;
        for (int num : arr) {
            if (num % 2 == 1) {
                if (++count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
}
