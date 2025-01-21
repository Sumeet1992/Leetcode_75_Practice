package org.sumeet.leetcode.remove_stars_from_a_string;

public class RemoveStarsFromAString {

    public static void main(String[] args) {
        RemoveStarsFromAString removeStarsFromAString = new RemoveStarsFromAString();
        String removedString = removeStarsFromAString.removeStars("leet**cod*e");
        System.out.println(removedString);
    }

    public String removeStars(String s) {

        char[] sArray = s.toCharArray();
        char[] finalStack = new char[sArray.length];
        StringBuilder finalString = new StringBuilder();
        int top = 0;

        for(char c : sArray){
            if(c != '*'){
                finalStack[top] = c;
                top++;
            }
            else{
                top--;
                finalStack[top] = ' ';
            }
        }

        for(int i = 0 ; i < top; i++){
            if(finalStack[i] != ' '){
                finalString.append(finalStack[i]);
            }
        }

        return finalString.toString();
    }

}
