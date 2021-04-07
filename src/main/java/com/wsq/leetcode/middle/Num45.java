package com.wsq.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Num45 {
    public static void main(String[] args) {
//        System.out.println(minNumber(new int[] {1,2,3,1}));

        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(-2);

        list.sort((s1, s2) -> {
            System.out.println("s1: " + s1 + "  s2: " + s2);
            return s1 + s2;
        });

        System.out.println(Arrays.toString(list.toArray()));
    }

    public static String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }

        list.sort((s1, s2) -> compare(s1+s2, s2+s1));

        StringBuilder sb = new StringBuilder();
        for (String a : list) {
            sb.append(a);
        }

        return sb.toString();
    }

    private static int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) continue;
                if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        if (s1.length() > s2.length()) {
            return 1;
        } else {
            return -1;
        }
    }
}
