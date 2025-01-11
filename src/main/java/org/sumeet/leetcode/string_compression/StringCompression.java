package org.sumeet.leetcode.string_compression;

public class StringCompression {

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress(chars));
    }

    public int compress(char[] chars) {

        int length = chars.length;
        if (length == 0) {
            return 0;
        }

        int  charsIndex = 0;
        int newArrIndex = 0;

        while(charsIndex < length){

            int count = 0;
            char currentChar = chars[charsIndex];

            while(charsIndex < length && currentChar == chars[charsIndex]){
                charsIndex = charsIndex + 1;
                count = count +1;
            }

            chars[newArrIndex] = currentChar;
            newArrIndex = newArrIndex + 1;

            if(count > 1){
                char[] countChar = String.valueOf(count).toCharArray();
                for(char c : countChar){
                    chars[newArrIndex] = c;
                    newArrIndex = newArrIndex + 1;
                }
            }

        }

        return newArrIndex;
    }

}
