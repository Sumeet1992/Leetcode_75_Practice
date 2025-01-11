package org.sumeet.leetcode.unique_number_of_occurences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        UniqueNumberOfOccurences uniqueNumberOfOccurences = new UniqueNumberOfOccurences();
        System.out.println(uniqueNumberOfOccurences.uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {

        Set<Integer> arrSet = new HashSet<Integer>();
        Set<Integer> numCountSet = new HashSet<Integer>();
        Map<Integer, Integer> arrMap = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            arrSet.add(arr[i]);
        }
        for(int i = 0; i<arr.length; i++){
            Integer count = arrMap.get(arr[i]);
            if(count == null){
                arrMap.put(arr[i], 1);
            }
            else{
                arrMap.put(arr[i], count+1);
            }
        }
        for(Map.Entry e : arrMap.entrySet()){
            numCountSet.add((Integer) e.getValue());
        }
        if(arrSet.size() == numCountSet.size()){
            return true;
        }
        else{
            return false;
        }
    }

}
