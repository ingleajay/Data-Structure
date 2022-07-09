package com.queue;

public class Main {
    // inserting is always the end
    // deleting is always in front
    public static void main(String[] args) {
        QueueImpl queue = new DynamicQueue(2);
        //QueueImpl queue = new QueueImpl(2);
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(100);
        queue.enqueue(101);
        queue.display();

        System.out.println( "Dequeue : " + queue.dequeue());
        System.out.println( "Dequeue : " + queue.dequeue());
        System.out.println( "Dequeue : " + queue.dequeue());
        queue.display();

        System.out.println("Front ele : " + queue.front());
        System.out.println("Rear ele : " + queue.rear());

        queue.delete();
        queue.display();
        System.out.println("Front ele : " + queue.front());
        System.out.println("Rear ele : " + queue.rear());
        queue.enqueue(122);
        queue.enqueue(12);
        queue.enqueue(22);
        queue.display();
        System.out.println("Front ele : " + queue.front());
        System.out.println("Rear ele : " + queue.rear());
    }
}
