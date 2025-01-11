package org.sumeet.leetcode.the_greatest_common_divisor_of_strings;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        String str1 = "ABAB";
        String str2 = "ABABAB";
        GreatestCommonDivisorOfStrings divisorOfStrings = new GreatestCommonDivisorOfStrings();
        System.out.println(divisorOfStrings.gcdOfStrings(str1,str2));
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcd = getGcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    public int getGcd(int a, int b) {
        if (b==0) return a;
        return getGcd(b,a%b);
    }

}
