package com.wsq.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Num17_10 {
    // 哈希表
    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, ++value);
            }
        }

        int l = nums.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > l / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    // 摩尔投票算法
    public int majorityElement2(int[] nums) {
        int major = 0, cnt = 0;
        for (
                int x : nums) {
            if (cnt == 0) {
                major = x;
                cnt++;
            } else {
                if (major == x)
                    cnt++;
                else
                    cnt--;
            }
        }

        if (cnt > 0) {
            int t = 0;
            // 有可能出现正负抵消，所以要再判断一次
            for (int x : nums)
                if (x == major)
                    t++;
            if (t > nums.length / 2) return major;
        }

        return -1;
    }
}
