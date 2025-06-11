package org.sumeet.leetcode;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Test {

    int retries = 10;
    String s;
    public static void main(String[] args) throws Exception {

        System.out.println((int) 'a');
        char c = 'c';
        if((int) c == 99)
            System.out.println("working");

        Test test = new Test();
//        test.testRecursion();
//        test.testTreeSet();

        String s = "I_am,sumeet";

        char[] sArray = s.toCharArray();
        String regex = "^[A-Za-z0-9]$";


        int i = 0;
        int j = s.length() - 1;
         while(i < j){
             while(i < j && !Pattern.matches(regex, String.valueOf(sArray[i]))){
                 System.out.println(sArray[i]);
                 i++;

             }
             while(i < j && !Pattern.matches(regex, String.valueOf(sArray[j]))){
                 System.out.println(sArray[j]);
                 j--;
             }
             char temp = sArray[i];
             sArray[i] = sArray[j];
             sArray[j] = temp;
             i++;
             j--;
         }

        System.out.println(Arrays.toString(sArray));

    }

    public void testTreeSet(){
String s = null;
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuilder("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        System.out.println(t);

    }

    public String testRecursion() throws Exception {

        try{
            s = s + retries;
             int i = 1/0;
        }
        catch(Exception e){
            if(retries != 0){
                System.out.println("retries left "+ retries);
                retries--;
                return testRecursion();
            }
            else{
                System.out.println("retries finished with error "+ e.getMessage());
                throw new Exception(e.getMessage());
            }
        }
        return "TestString";

    }

}
