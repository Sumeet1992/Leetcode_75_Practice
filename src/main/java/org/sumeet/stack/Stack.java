package org.sumeet.stack;

public class Stack {

    int[] stack = new int[5];
    int top  = 0;

    public void push (int data){
        stack[top] = data;
        top++;
    }

    public int pop(){
        top--;
        int pop_data = stack[top];
        stack[top] = 0;
        return pop_data;
    }

    public int peek(){
        int top_data = stack[top-1];
        return top_data;
    }

    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
