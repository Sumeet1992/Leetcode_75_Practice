package org.sumeet.leetcode.find_difference_of_two_arrays;

import java.util.*;

public class FindDifferenceOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        FindDifferenceOfTwoArrays findDifferenceOfTwoArrays = new FindDifferenceOfTwoArrays();
        List<List<Integer>> answerList = findDifferenceOfTwoArrays.findDifference(nums1, nums2);
        System.out.println(answerList.toString());
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> nums2Set = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            nums1Set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            nums2Set.add(nums2[i]);
        }
        List<Integer> mergedNums = new ArrayList<>();
        mergedNums.addAll(nums1Set);
        mergedNums.addAll(nums2Set);
        List<Integer> nums1Integers = new ArrayList<>();
        List<Integer> nums2Integers = new ArrayList<>();
        List<List<Integer>> answerList = new ArrayList<>();
        Map<Integer, Integer> integerCount = new HashMap<>();

        for (int i = 0; i < mergedNums.size(); i++){
            Integer count = integerCount.get(mergedNums.get(i));
            if(count == null){
                integerCount.put(mergedNums.get(i), 1);
            }
            else{
                integerCount.put(mergedNums.get(i), count+1);
            }
        }
        for(int j = 0; j<mergedNums.size(); j++){
            Integer intCount = integerCount.get(mergedNums.get(j));
            if(intCount == 1){
                if(j< nums1Set.size()){
                    nums1Integers.add(mergedNums.get(j));
                }
                else{
                    nums2Integers.add(mergedNums.get(j));
                }
            }
        }
        answerList.add(nums1Integers);
        answerList.add(nums2Integers);
        return answerList;
    }

}
