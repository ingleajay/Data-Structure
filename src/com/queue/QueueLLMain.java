package com.queue;

public class QueueLLMain {
    public static void main(String[] args) {
        QueueSinglyLL queue= new QueueSinglyLL();
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(100);
        queue.enqueue(101);
        queue.display();

        System.out.println("Peek :  " + queue.peek());
        queue.dequeue();
        queue.display();

        queue.delete();
        queue.display();
        System.out.println("Peek :  " + queue.peek());
        queue.enqueue(199);
        queue.enqueue(133);
        queue.display();

    }
}
