package com.wsq.leetcode.middle;

public class Num1535 {
    public static void main(String[] args) {
        System.out.println(getWinner(new int[]{2,1,3,5,4,6,7}, 2));
    }

    public static int getWinner(int[] arr, int k) {
        int max = Math.max(arr[0], arr[1]);
        int count = 1;
        if (count == k) {
            return max;
        }

        for (int i = 2; i < arr.length; i++) {
            if (max > arr[i]) {
                count++;
            } else {
                max = arr[i];
                count = 1;
            }

            if (count == k) {
                return max;
            }
        }

        return max;
    }
}
