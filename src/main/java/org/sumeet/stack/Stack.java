package org.sumeet.stack;

public class Stack {

    int[] stack = new int[5];
    int top  = 0;

    public void push (int data){

        if(top  >= stack.length){
            System.out.println("Stack is Full");
        }
        else{
            stack[top] = data;
            top++;
        }
    }

    public int pop(){

        int pop_data = 0;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            pop_data = stack[top];
            stack[top] = 0;
        }
        return pop_data;

    }

    public int peek(){

        int top_data = 0;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top_data = stack[top-1];
        }
        return top_data;
    }

    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(top <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
