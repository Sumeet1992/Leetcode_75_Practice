package org.sumeet.leetcode.move_zeroes;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,1,1,1};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

    }

    public void moveZeroes(int[] nums) {

        //int right=0;
        int left=0;
        for(int right=0;right< nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
