package com.wsq.leetcode.middle;

import java.util.Arrays;

public class Num1476 {
    int[][] rectangle;

    public Num1476(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (; row1 <= row2; row1++) {
            for (int i = col1; i <= col2; i++) {
                rectangle[row1][i] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        Num1476 num1476 = new Num1476(new int[][]{{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        System.out.println(Arrays.deepToString(num1476.rectangle));
        num1476.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(Arrays.deepToString(num1476.rectangle));
        System.out.println(num1476.getValue(0, 2));
    }
}