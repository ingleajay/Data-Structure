package com.array;

public class OnDeleteArrayEleFindLen {

    // deleting can also be set value as Integer.MIN_VALUE

    public static void main(String[] args) {
        System.out.println(deleteEleFindNewLen(new int[]{1,2,3,4}, 2));
    }

    private static int deleteEleFindNewLen(int[] a, int index) {
        int[] anotherArray = new int[a.length - 1];
        for(int i=0,k=0;i<a.length;i++){
            if(index == i){
                continue;
            }
            anotherArray[k++] = a[i];
        }
        return anotherArray.length;
    }
}
