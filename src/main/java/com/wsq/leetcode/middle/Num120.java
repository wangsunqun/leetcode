package com.wsq.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] fn = new int[size][size];
        fn[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    fn[i][j] = fn[i - 1][0] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    fn[i][j] = fn[i - 1][i - 1] + triangle.get(i).get(j);
                } else {
                    fn[i][j] = Math.min(fn[i - 1][j], fn[i - 1][j - 1]) + triangle.get(i).get(j);
                }
            }
        }

        Arrays.sort(fn[size - 1]);

        return fn[size - 1][0];
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        list.add(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        list.add(l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        list.add(l3);

        List<Integer> l4 = new ArrayList<>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        list.add(l4);

        System.out.println(minimumTotal(list));
    }
}
