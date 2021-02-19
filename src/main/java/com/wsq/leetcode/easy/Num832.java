package com.wsq.leetcode.easy;

import java.util.Arrays;

public class Num832 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        boolean flag = A[0].length % 2 == 1;

        for (int i = 0; i < A.length; i++) {
            if (flag) {
                A[i][A[i].length / 2] = A[i][A[i].length / 2] ^ 1;
            }

            for (int j = 0; j < A[i].length / 2; j++) {
                int tmp = A[i][j] ^ 1;
                A[i][j] = A[i][A[i].length - j - 1] ^ 1;
                A[i][A[i].length - j - 1] = tmp;
            }
        }

        return A;
    }
}
