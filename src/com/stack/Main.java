package com.stack;

public class Main {
    public static void main(String[] args) {
        StackImpl stack = new DynamicStack(2);
        //StackImpl stack = new StackImpl(2);
        stack.push(10);
        stack.push(11);
        stack.push(13);
        stack.push(2);
        stack.push(90);
        stack.display();

        System.out.println("Pop : " + stack.pop());
        stack.display();
        System.out.println("Pop : " + stack.pop());
        stack.display();

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop : " + stack.pop());
        stack.display();
        stack.delete();
        stack.display();
    }
}
