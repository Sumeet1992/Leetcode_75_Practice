package org.sumeet.stack;

public class DynamicArrayStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top  = 0;

    public void push (int data){

        if(size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
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
            shrink();
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

    public void expand(){
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0 , newStack, 0, length);
        stack = newStack;
        capacity = capacity * 2;
    }

    public void shrink(){

        int length = size();
        if(length <= (capacity/2)/2){
            capacity = capacity/2;
        }
        int newStack[] = new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;

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
