package com.stack;


public class StackSinglyLL {
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

    private Node head;
    private int size;

    // T.C = O(1) and S.C = O(1)
    public boolean isEmpty(){
        return head==null;
    }

    // T.C = O(1) and S.C = O(1)
    public void delete(){
        head = null;
    }

    // T.C = O(1) and S.C = O(1)
    public int peek(){
        return head.data;
    }

    // T.C = O(1) and S.C = O(1)
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return deleteFirst();
    }

    // T.C = O(1) and S.C = O(1)
    public boolean push(int nodeData){
        return insertFirst(nodeData);
    }

    // T.C = O(1) and S.C = O(1)
    public boolean insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
        return true;
    }

    // T.C = O(1) and S.C = O(1)
    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // T.C = O(n) and S.C = O(1)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
