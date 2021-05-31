package com.wsq.leetcode.middle;

public class Num1006 {
    public static int clumsy(int N) {
        int i = N / 4;
        int x = N % 4;

        int result;
        if (i != 0) {
            result = N * --N / --N + --N;
            --N;
            --i;
        } else {
            if (x == 1) {
                result = N;
            } else if (x == 2) {
                result = N * --N;
            } else {
                result = N * --N / --N;
            }

            return result;
        }

        for (; i != 0; i--) {
            result -= N * --N / --N - --N;
            --N;
        }

        if (x == 1) {
            result -= N;
        } else if (x == 2) {
            result -= N * --N;
        } else {
            result -= N * --N / --N;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(clumsy(4));
    }
}