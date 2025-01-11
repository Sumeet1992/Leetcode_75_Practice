package org.sumeet.leetcode.max_number_of_vowels_in_a_substring;

public class MaxVowelsInSubstring {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        MaxVowelsInSubstring maxVowelsInSubstring = new MaxVowelsInSubstring();
        int maxVowels = maxVowelsInSubstring.maxVowels(s,k);
        System.out.println(maxVowels);
    }

    public int maxVowels(String s, int k) {

        int vowelCount = 0;
        char[] sChar = s.toCharArray();

        for(int i = 0; i< k; i++){
            if(sChar[i] == 'a' || sChar[i] == 'e' || sChar[i] == 'i' || sChar[i] == 'o' || sChar[i] == 'u'){
                vowelCount+= 1;
            }
        }

        int maxVowelCount = vowelCount;
        int end = sChar.length - k;
        for(int i = 1; i<=end ; i++){
            if(sChar[i+k-1] == 'a' || sChar[i+k-1] == 'e' || sChar[i+k-1] == 'i' || sChar[i+k-1] == 'o' || sChar[i+k-1] == 'u'){
                vowelCount+=1;
            }
            if(sChar[i-1] == 'a' || sChar[i-1] == 'e' || sChar[i-1] == 'i' || sChar[i-1] == 'o' || sChar[i-1] == 'u'){
                vowelCount-=1;
            }

            if(maxVowelCount < vowelCount){
                maxVowelCount = vowelCount;
            }

        }

        return maxVowelCount;
    }

}
