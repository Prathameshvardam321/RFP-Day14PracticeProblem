package com.bridgelabz.stackqueue;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        System.out.println();
        System.out.println();
        stack.peak();
        stack.popStack();
        stack.display();
        System.out.println();
        System.out.println();
        stack.peak();
        stack.popStack();
        stack.display();
        System.out.println();
        System.out.println();
        stack.peak();
        stack.popStack();
        stack.display();



    }
}
