package org.sumeet.leetcode.product_of_array_except_self;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

            int[] nums = {1,2,3,4};
            ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
            int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
    }

    public int[] productExceptSelf(int[] nums) {

        int numsLength = nums.length;
        int[] prefix = new int[numsLength];
        int[] suffix = new int[numsLength];
        int[] finalProduct = new int[numsLength];

        prefix[0] = 1;
        for(int i = 1; i< numsLength; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[numsLength-1] = 1;
        for(int j = numsLength-2; j>=0; j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }

        for(int k = 0; k< numsLength; k++){
            finalProduct[k] = prefix[k] * suffix[k];
        }
        return finalProduct;
    }

}
