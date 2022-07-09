package com.recursion;

import java.util.Arrays;

class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) {
            return false; }
        else {
            return true;
        }
    }
}

public class FindOddFromArr {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(someRecursive(arr,new OddFunction()));

    }
    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if(arr.length == 0)
            return  false;
        else if (odd.run(arr[0])==false) {
            return someRecursive(Arrays.copyOfRange(arr,1,arr.length),odd);
        }
        else{
            return true;
        }
    }

    // 1, 2, 3, 4
    // 1= true

    // 2, 8,  4,1
    // 2 = false => 8,4,1
    // 8 = false => 4,1
    // 4 = false => 1
    // 1 = true
}
