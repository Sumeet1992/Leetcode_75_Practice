package org.sumeet.leetcode.maximum_average_subarray_i;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {

            int[] nums = {8860,-853,6534,4477,-4589,8646, -6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
            int k = 93;
            MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
            System.out.println(maximumAverageSubarrayI.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {

        double windowSum = 0;
        // Calculate the sum of the first 'k' elements (initial window)
        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Store the initial window sum as the maximum sum
        double maxSum = windowSum;

        // Slide the window across the array, adjusting the sum
        int end = nums.length - k;
        for(int i = 1;  i <= end; i++) {
            windowSum = windowSum + (nums[i + k - 1] - nums[i - 1]);
            if(windowSum > maxSum)
                maxSum = windowSum;
        }
        return maxSum / k;
    }

}
