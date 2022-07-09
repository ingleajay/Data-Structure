package com.timecomplexityandspace;

public class SumAndProductOfArray {

    public static void main(String[] args) {

        int a[] = { 2,1,4};
        int res[] = sumAndproduct(a);
        System.out.println("Sum : " + res[0] + " " + " Product : " + res[1]);
    }

    // Time Complexity = 0(n)
    private static int[] sumAndproduct(int[] a) {
        int sum = 0;
        int product = 1;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
            product = product*a[i];
        }
        return new int[]{sum,product};
    }
}
