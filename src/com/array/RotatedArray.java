package com.array;

import java.util.Arrays;
public class RotatedArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int len = a.length-1;
        for(int i=len;i>=0;i--){
            for(int j=0;j<len+1;j++){
                System.out.println(a[len-j][len-i]);
//                int t  =a[len-j][len-i];
//                a[len-j][len-i] = a[i][j];
//                int f = a[len-j][len-i];
//                a[i][j] =t;
            }
        }
        for (int[] i : a){
            System.out.println(Arrays.toString(i));
        }
    }

}
