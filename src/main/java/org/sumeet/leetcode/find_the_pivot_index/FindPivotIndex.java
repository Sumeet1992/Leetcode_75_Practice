package org.sumeet.leetcode.find_the_pivot_index;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int pivotIndex = findPivotIndex.pivotIndex(nums);
        System.out.println(pivotIndex);
    }

    public int pivotIndex(int[] nums) {

        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int totalSum=0;
        int pIndex = -1;
        for(int j = 0; j< nums.length; j++){
            totalSum+=nums[j];
        }

        if((totalSum-nums[0]) == 0){
            pIndex = 0;
            return pIndex;
        }
        else if((totalSum-nums[nums.length - 1]) == 0){
            pIndex = nums.length - 1;
        }
            for(int i = 1; i < nums.length; i++){
                sumLeft[i] = sumLeft[i-1] + nums[i-1];
                sumRight[i] = totalSum - sumLeft[i] - nums[i];
                if(sumLeft[i] == sumRight[i]){
                    pIndex = i;
                    break;
                }

            }
        return pIndex;
    }
}
