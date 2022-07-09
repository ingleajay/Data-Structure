package com.queue;

public class CircularQueue {

    // data of queue
    protected int[] data;
    // size of your queue
    private static final int DEFAULT_SIZE=10;

    // set size by constructor to queue
    CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public boolean enqueue(int item){
        // if queue is overflow then check stack
        if(isFull()){
            System.out.println("Queue is overflow..");
            return false;
        }
        data[end++] = item;
        end = end% data.length;
        size++;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is underflow..");
        }
        int removed = data[front++];
        front = front% data.length;
        size--;
        return removed;
    }

    boolean isFull() {
        return size == data.length;
    }

    public void display(){
            if(isEmpty()){
                System.out.println("Queue is underflow...");
            }
            int i = front;
            do{
                System.out.print(data[i] + " ");
                i++;
                i = i % data.length;
            }while (i != end);
        System.out.println(" ");
    }

    // T.C = O(1) and S.C=O(1)
    public  int rear(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return data[end%data.length];
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return data[front% data.length];
    }

    private boolean isEmpty(){
        return size==0 ;
    }
}
