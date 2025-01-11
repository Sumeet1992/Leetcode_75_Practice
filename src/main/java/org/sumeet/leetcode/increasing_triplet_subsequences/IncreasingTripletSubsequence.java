package org.sumeet.leetcode.increasing_triplet_subsequences;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {

        int[] nums = {3,1,2,0,3};
        IncreasingTripletSubsequence tripletSubsequence = new IncreasingTripletSubsequence();
        System.out.println(tripletSubsequence.increasingTriplet(nums));
    }

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length; i++){

            if(nums[i] <= first){
                first = nums[i];
            }else if(nums[i] <= second){
                second = nums[i];
            }else{
                return true;
            }
        }

        return false;
    }

}
