package org.sumeet.leetcode.is_subsequence;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "ab", t = "bacb";
        IsSubsequence subsequence = new IsSubsequence();
        System.out.println(subsequence.isSubsequence(s,t));
    }

    public boolean isSubsequence(String s, String t) {

        int start = 0;
        int count = 0;

        for(int i=0; i < s.length(); i++){
            for(int j = start; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    start = j+1;
                    count++;
                    break;
                }
            }
        }
        if(count == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
