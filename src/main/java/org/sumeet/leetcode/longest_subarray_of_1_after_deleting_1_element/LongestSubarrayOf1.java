package org.sumeet.leetcode.longest_subarray_of_1_after_deleting_1_element;

public class LongestSubarrayOf1 {

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        LongestSubarrayOf1 longestSubarrayOf1 = new LongestSubarrayOf1();
        int maxLngth = longestSubarrayOf1.longestSubarray(nums);
        System.out.println(maxLngth);
    }

    public int longestSubarray(int[] nums) {

        int count=1;
        int start = 0;
        int end = 0;

        int maxlngth = 0;

        while(end < nums.length){

            if(nums[end] == 1){
                end++;
            }
            else if(nums[end] == 0 && count == 1){
                end++;
                count--;
            }
            else if(nums[end] == 0 && count == 0){
                if(nums[start] == 0){
                    count++;
                }
                start++;
            }
            maxlngth = Math.max(maxlngth, end-start-1);


        }

        return maxlngth;
    }

}
