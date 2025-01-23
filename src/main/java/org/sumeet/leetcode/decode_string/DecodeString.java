package org.sumeet.leetcode.decode_string;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString(s));
    }

    public String decodeString(String s) {

        char[] sArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : sArray){
            if(c == ']'){
                StringBuilder encodedString = new StringBuilder();
                while(stack.peek() != '['){
                    encodedString.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder kDigit = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    kDigit.insert(0, stack.pop());
                }
                int count = Integer.parseInt(kDigit.toString());

                String repeatedString = encodedString.toString().repeat(count);

                for(Character rs : repeatedString.toCharArray()){
                    stack.push(rs);
                }

            }
            else{
                stack.push(c);
            }
        }
        StringBuilder finalString = new StringBuilder();
        for(Character c : stack){
            finalString.append(c);
        }

        return finalString.toString();
    }

}
