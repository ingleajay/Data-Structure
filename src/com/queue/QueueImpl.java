package com.queue;

public class QueueImpl {
    // data of queue
    protected int[] data;
    // size of your queue
    private static final int DEFAULT_SIZE=10;

    // set size by constructor to queue
    QueueImpl(){
        this(DEFAULT_SIZE);
    }

    public QueueImpl(int size) {
        this.data = new int[size];
    }

    int end = -1;

    // T.C = O(1) and S.C=O(1)
    public boolean enqueue(int item){
        // if queue is overflow then check stack
        if(isFull()){
            System.out.println("Queue is overflow..");
            return false;
        }
        end++;
        data[end] = item;
        return true;
    }

    // T.C = O(1) and S.C=O(1)
    public int dequeue(){
        int removed = -1;
        if(isEmpty()){
            System.out.println("Queue is underflow..");
        }
        else{
            removed = data[0];
            // shift ele by 1 to left
            for (int i = 1; i <= end; i++) {
                data[i - 1] = data[i];
            }
            data[end] = 0;
            end--;
        }
        return removed;
    }

    // T.C = O(1) and S.C=O(1)
    public int front(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return end!= -1 ? data[0] : -1;
    }

    // T.C = O(1) and S.C=O(1)
    public  int rear(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return end!= -1 ? data[end] : -1;
    }


    // T.C = O(1) and S.C=O(1)
    boolean isFull() {
        return end == data.length-1;
    }

    // T.C = O(n) and S.C=O(1)
    public void display(){
        if(!(isEmpty()) && end != -1) {
            for (int i : data) {
                    if(i != 0) {
                        System.out.print(i + " ");
                    }
            }
            System.out.println(" ");
        }
        else{
            System.out.println("There is item to display..");
        }

    }

    // T.C = O(1) and S.C=O(1)
    private boolean isEmpty(){
        return end==-1 ;
    }

    // T.C = O(1) and S.C=O(1)
    public void delete(){
        if(isEmpty()){
            System.out.println("There is no item for delete...");
        }
        int i=0;
        while(i<data.length) {
            data[i] = 0;
            i++;
        }
        end = -1;
        System.out.println("Deleted all items from queue..");
    }
}
