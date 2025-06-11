package org.sumeet.leetcode.reverse_words_in_a_string;

import java.util.Arrays;

public class ReverseWordsInAString {

    public static void main(String[] args) {

        String s = " I am   Sumeet ";
        ReverseWordsInAString wordsInAString = new ReverseWordsInAString();
        System.out.println(wordsInAString.reverseWords(s));
    }

    public String reverseWords(String s) {

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        int start = 0;
        int end = words.length - 1;

        while(start < end){

            while(start < end && words[start].isBlank()){
                start++;
            }
            while(start < end && words[end].isBlank()){
                end--;
            }

            String tmp = words[start];
            words[start] = words[end];
            words[end] = tmp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(words));
        String reversedString = words[0];
        System.out.println("reversed string first word:"+reversedString+"is this.");
        for(int i = 1; i< words.length; i++){
            if(!words[i].isBlank()){
                reversedString = reversedString + " " +words[i];
            }
        }

        return reversedString.trim();
    }
}
