package org.sumeet.leetcode.reverse_vowels_of_a_string;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s  = "a.ob,.e";
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        System.out.println(reverseVowelsOfAString.reverseVowels(s));
    }

    public String reverseVowels(String s) {

        char[] sArray = s.toCharArray();
        int first = 0;
        int last = sArray.length - 1;
        String vowels = "aeiouAEIOU";

        while(first < last){

            while(first < last && vowels.indexOf(sArray[first]) == -1){
                first++;
            }
            while(first < last && vowels.indexOf(sArray[last]) == -1){
                last--;
            }
            char tmp = sArray[first];
            sArray[first] = sArray[last];
            sArray[last] = tmp;

            first++;
            last--;

        }
        return new String(sArray);
    }

}
