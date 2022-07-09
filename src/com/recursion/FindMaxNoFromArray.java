package com.recursion;

public class FindMaxNoFromArray {

    public static void main(String[] args) {

        int a[] = { 2,12,3,4,51};
        int max = maximum(a,a.length);
        System.out.println("Max  : " + max);
    }

    private static int maximum(int[] a, int n) {
        if(n == 1)
            return a[0];
        else
            return Math.max(a[n-1],maximum(a,n-1));
    }

    // maximum(a,5) = max(51,12) = 51
    // maximum(a,4) = max( 4, 12) = 12
    // maximum(a,3) = max ( 3,12) = 12
    // maximum(a,2) = max(12,2)= 12
    // maximum(a,1) = 2
}
