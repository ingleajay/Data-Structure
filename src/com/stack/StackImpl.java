package com.stack;
// T.C = O(1) and S.C = O(1)
public class StackImpl {
    // data of stack
    protected int[] data;
    // size of your stack
    private static final int DEFAULT_SIZE=10;

    // set size by constructor to stack
    StackImpl(){
        this(DEFAULT_SIZE);
    }

    public StackImpl(int size) {
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean push(int item){
        // if stack is overflow then check stack
        if(isFull()){
            System.out.println("Stack is overflow..");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        // stack is underflow
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        int removed = -1;
        if(ptr != -1) {
            removed = data[ptr];
            data[ptr] = 0;
            ptr--;
        }
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is underflow...");
        }
        return ptr!= -1 ? data[ptr] : -1;
    }

    public void display(){
        if(!(isEmpty()) && data != null) {
            for (int i : data) {
                if (i != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
        }
        else{
            System.out.println("There is no item to display..");
        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("There is no item for delete...");
        }
        data = null;
        System.out.println("Deleted all items from stack..");
    }

    boolean isFull() {
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1 ;
    }


}
