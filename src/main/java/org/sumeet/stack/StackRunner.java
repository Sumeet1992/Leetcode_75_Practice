package org.sumeet.stack;

public class StackRunner {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(7);
        stack.push(5);
        stack.push(8);
        stack.push(2);
        stack.push(4);
        stack.push(4);

        stack.show();

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        stack.peek();
        stack.show();

    }
}
