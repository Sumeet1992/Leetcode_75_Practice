package org.sumeet.leetcode.determine_if_two_string_are_close;

import java.util.*;

public class DetermineIfTwoStringsAreClose {

    public static void main(String[] args) {

        String word1 = "cabbba", word2 = "abbccc";
        DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();
        System.out.println(determineIfTwoStringsAreClose.closeStrings(word1, word2));
    }

    public boolean closeStrings(String word1, String word2) {

        int word1Length = word1.length();
        int word2Length = word2.length();

        if(word1Length != word2Length){
            return false;
        }

        Map<Character, Integer> word1CountMap = new HashMap<>();
        Map<Character, Integer> word2CountMap = new HashMap<>();

        for(int i = 0; i<word1Length; i++){
            Integer count1 = word1CountMap.get(word1.charAt(i));
            Integer count2 = word2CountMap.get(word2.charAt(i));
            if (count1 == null) {
                word1CountMap.put(word1.charAt(i), 1);
            }
            else{
                word1CountMap.put(word1.charAt(i), count1 +1);
            }
            if (count2 == null) {
                word2CountMap.put(word2.charAt(i), 1);
            }
            else{
                word2CountMap.put(word2.charAt(i), count2 +1);
            }
        }


        System.out.println(word1CountMap.toString());
        System.out.println(word2CountMap.toString());

        if(word1CountMap.size() != word2CountMap.size()){
            return false;
        }

        for(Map.Entry entry : word1CountMap.entrySet()){
            Character word1Char = (Character) entry.getKey();
            Integer word1CharCount = (Integer) entry.getValue();

            if(! word2CountMap.containsKey(word1Char)){
                System.out.println("not found key");
                return false;
            }

            if (! word2CountMap.containsValue(word1CharCount)){
                System.out.println("not found value");
                return false;
            }
        }

        List<Integer> word1List = new ArrayList<>();
        List<Integer> word2List = new ArrayList<>();
        for(Character ch1 : word1CountMap.keySet()){
            word1List.add(word1CountMap.get(ch1));
        }
        for(Character ch2 : word2CountMap.keySet()){
            word2List.add(word2CountMap.get(ch2));
        }
        Collections.sort(word1List);
        Collections.sort(word2List);
        for(int i = 0 ; i< word1List.size(); i++){
            if(!Objects.equals(word1List.get(i), word2List.get(i))){
                return false;
            }
        }
        return true;
    }

}
