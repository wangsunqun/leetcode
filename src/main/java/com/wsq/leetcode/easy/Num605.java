package com.wsq.leetcode.easy;

public class Num605 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0) return true;

        if (flowerbed.length > 1) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0 && n != 0) {
                flowerbed[0] = 1;
                n--;
            }

            if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0 && n != 0) {
                flowerbed[flowerbed.length - 1] = 1;
                n--;
            }
        }

        for (int i = 0; i < flowerbed.length - 2 && n != 0; i++) {
            if (flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i+2] == 0) {
                flowerbed[i+1] = 1;
                n--;
            }
        }

        return n == 0;
    }
}