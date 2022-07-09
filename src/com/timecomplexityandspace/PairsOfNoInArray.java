package com.timecomplexityandspace;

public class PairsOfNoInArray {

    public static void main(String[] args) {

        int a[] = { 1,2,3};
        pairs(a);
        System.out.println();
    }

    // Time complexity = O(n^2)
    private static void pairs(int[] a) {
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                int no = Integer.parseInt(a[i] + "" + a[j]);
                System.out.println(no);
            }
        }
    }
}
