package com.queue;

public class QueueSinglyLL {
    class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node(int data) {
            this.data = data;
        }
    }
    private Node front;
    public int size;
    private Node rear;

    // T.C = O(1) and S.C = O(1)
    public boolean isEmpty(){
        return front==null;
    }

    // T.C = O(1) and S.C = O(1)
    public int peek(){
        return isEmpty()==true ? -1: front.data;
    }

    public void enqueue(int nodeData){
        insertLast(nodeData);
    }

    // T.C = O(1) and S.C=O(1)
    public int dequeue(){
        return isEmpty()==true ? -1: deleteFirst();
    }

    public int deleteFirst() {
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return val;
    }

    public void insertLast(int val) {
        if (rear == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        rear.next = node;
        rear = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = front;
        front = node;
        if (rear == null) {
            rear = front;
        }
        size += 1;
    }

    // T.C = O(n) and S.C = O(1)
    public void display() {
        Node temp = front;
        while (temp != null && rear != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // T.C = O(1) and S.C=O(1)
    public void delete(){
        if(isEmpty()){
            System.out.println("There is no item for delete...");
        }
        front = null;
        rear = null;
        System.out.println("Deleted all items from queue..");
    }
}
