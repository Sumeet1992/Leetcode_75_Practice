package org.sumeet.leetcode.max_consecutive_ones_3;

public class MaxConsecutiveOnes3 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
//        int[] nums = {0,0,0,1};
//        int k = 4;
        MaxConsecutiveOnes3 maxConsecutiveOnes3 = new MaxConsecutiveOnes3();
        int maxLength = maxConsecutiveOnes3.longestOnes(nums, k);
        System.out.println(maxLength);
    }

    public int longestOnes(int[] nums, int k) {

        int start = 0;
        int end = 0;
        int maxLength = 0;
        int count = k;
        while(end < nums.length){
            if(nums[end] == 1){
                end++;
            }
            else if(nums[end] == 0 && count > 0){
                end++;
                count--;
            }
            else if(count == 0 && nums[end] == 0){
                if (nums[start] == 0) {
                    count++;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start);
        }

        return maxLength;
    }

}
