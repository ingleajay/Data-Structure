package com.stack;

public class DynamicStack extends StackImpl{

    DynamicStack(){
        super(); // call parent constrictor
    }

    public DynamicStack(int size){
        super();
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // make size almost double like arraylist
            int[] temp = new int[data.length*2];
            // copy element to new
            for (int i=0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
