package com.stack.questions;
class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // isFull
    public boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0) {
            return true;
        } else {
            return false;
        }
    }

    // indexOfTop

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    // push
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The Stack is Full");
        } else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }


    public static void main(String[] args) {
        ThreeInOne t = new ThreeInOne(3);
        t.push(0,1);
        t.push(0,2);
        t.push(1,11);
        t.push(1,22);
        t.push(2,13);
        t.push(2,25);
        System.out.println( t.pop(1));
        System.out.println(t.peek(2));
        t.push(2,15);

        System.out.println(t.peek(2));
    }
}

