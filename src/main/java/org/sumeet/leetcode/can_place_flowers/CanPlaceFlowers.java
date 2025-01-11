package org.sumeet.leetcode.can_place_flowers;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] flowerbed = {0,0,0,1,0};
        int n = 1;

        CanPlaceFlowers flowers = new CanPlaceFlowers();
        System.out.println(flowers.canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        int maxFlowersAllowed = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                maxFlowersAllowed++;
            }
        }
        return n <= maxFlowersAllowed;

    }
}
