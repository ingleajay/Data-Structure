package com.array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missNo(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,15,16})));
    }

    public static int[] missNo(int[] a) {
        int newArr[] = new int[1];
        for(int i=0;i<a.length;i++){
            if(a[i] != i+1){
                newArr[0]=i+1;
                break;
            }
        }
        return newArr;
    }
}
