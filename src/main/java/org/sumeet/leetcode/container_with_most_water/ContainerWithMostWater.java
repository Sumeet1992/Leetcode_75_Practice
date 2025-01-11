package org.sumeet.leetcode.container_with_most_water;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(height));
    }

    public int maxArea(int[] height) {

        int length = height.length;
        int maxVolume = 0;

        for (int i = 0; i< length; i++){
            for(int j = i + 1 ; j < length; j++){
                int volume = 0;

                if(height[i] < height[j]){
                    volume = height[i] * (j-i);
                }
                else {
                    volume = height[j] * (j-i);
                }

                if(volume > maxVolume){
                    maxVolume = volume;
                }
            }
        }

        return maxVolume;
    }

}
