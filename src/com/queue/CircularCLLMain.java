package com.queue;

public class CircularCLLMain {
    public static void main(String[] args) {
        CircularQueueCircularLL cq = new CircularQueueCircularLL();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        cq.dequeue();
        cq.display();
        cq.enqueue(8);
        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.display();
        cq.dequeue();
        cq.enqueue(11);
        cq.enqueue(12);
        cq.display();
        cq.delete();
        cq.display();
        cq.enqueue(1111);
        cq.display();
    }
}
