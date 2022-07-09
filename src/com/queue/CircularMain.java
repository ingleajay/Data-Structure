package com.queue;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(50);
        c.display();
        System.out.println("Front  : " + c.front());
        System.out.println("Rear : " + c.rear());
        c.dequeue();
        c.display();
        System.out.println("Front  : " + c.front());
        System.out.println("Rear : " + c.rear());
        // override value
        c.enqueue(40);
        c.enqueue(50);
        c.display();
        System.out.println("Front  : " + c.front());
        System.out.println("Rear : " + c.rear());
        c.enqueue(60);
        c.display();

    }
}
