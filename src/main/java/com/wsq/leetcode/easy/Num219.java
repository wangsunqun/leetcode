package com.wsq.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Num219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {4,1,2,3,1,5}, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer tmp = map.get(nums[i]);
            if (tmp == null) {
                map.put(nums[i], i);
            } else {
                if (i - tmp <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }

        return false;
    }
}
