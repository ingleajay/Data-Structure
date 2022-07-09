package com.queue;

import com.linkedlist.circularlinkedlist.Node;

public class CircularQueueCircularLL {

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

    private Node front ;
    private Node rear ;

    public boolean isEmpty(){
        return front==null;
    }

    public  void enqueue(int nodeData){
        insertLast(nodeData);
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (front == null)
            front = node;
        else
            rear.next = node;
        rear = node;
        rear.next = front;
    }

    public int dequeue(){
        // delete from first
        if(isEmpty()){
            System.out.println("There is no element for delete...");
        }
        return  deleteFirst();
    }

    public int deleteFirst() {
        int val;
        if(front==rear){
            rear= null;
            front = null;
            return -1;
        }
        else{
            Node temp = front;
            val = temp.data;
            front = front.next;
            rear.next = front;

        }
        return val;
    }

    public void display(){
        // check if node is created or not
        if(front == null){
            System.out.println("CQCLL does not exist...");
        }else{
            // start with head
            Node tempNode = front;
            while(tempNode.next != front){
                System.out.print(tempNode.data + " -> ");
                tempNode = tempNode.next;
            }
            System.out.print(tempNode.data);
        }
        System.out.println(" ");
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("There is no item for delete...");
        }
        front = null;
        rear.next=null;
        rear = null;
        System.out.println("Deleted all items from queue..");
    }
}

