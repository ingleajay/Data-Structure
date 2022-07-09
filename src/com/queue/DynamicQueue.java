package com.queue;

public class DynamicQueue extends  QueueImpl{
    DynamicQueue(){
        super(); // call parent constrictor
    }

    public DynamicQueue(int size){
        super();
    }

    @Override
    public boolean enqueue(int item) {
        if(this.isFull()){
            // make size almost double like arraylist
            int[] temp = new int[data.length*2];
            // copy element to new
            for (int i=0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.enqueue(item);
    }
}
