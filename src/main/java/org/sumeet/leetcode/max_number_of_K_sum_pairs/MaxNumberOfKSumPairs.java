package org.sumeet.leetcode.max_number_of_K_sum_pairs;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();
        System.out.println(maxNumberOfKSumPairs.maxOperations(nums,k));
    }

    public int maxOperations(int[] nums, int k) {
       int count = 0;

       int countZeroes = 0;

//       This is done because the minimum num[i] will be 1.
//       So anything >= k will be set to 0 and then the array will be sorted.
//       So that during checking the count, the initial index can start after the zeroes in the array rather than from the beginning.
//        This saves time.
       for(int i = 0; i< nums.length; i++){
           if(nums[i] >= k){
               nums[i] = 0;
               countZeroes++;
           }
       }

       Arrays.sort(nums);

       int i = countZeroes;
       int j = nums.length-1;
       while(i<j){
           if(nums[i] + nums[j] == k){
               count++;
               i++;
               j--;
           } else if (nums[i] + nums[j] < k) {
               i++;
           }
           else if (nums[i] + nums[j] > k){
               j--;
           }
       }

        return count;
    }

}
