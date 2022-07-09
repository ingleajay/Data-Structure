package com.stack;

public class StackLLMain {
    public static void main(String[] args) {
        StackSinglyLL s = new StackSinglyLL();
        s.push(101);
        s.push(102);
        s.push(103);
        s.push(1);
        s.display();

        s.pop();
        s.display();
        System.out.println("Peek : " + s.peek());

        s.delete();
        s.display();

    }
}
