package org.sumeet.stack;

public class DynamicStackRunner {

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(7);
        stack.show();
        stack.push(5);
        stack.show();
        stack.push(8);
        stack.show();
        stack.push(2);
        stack.show();
        stack.push(4);
        stack.show();
        stack.push(4);
        stack.show();

        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();

    }
}
