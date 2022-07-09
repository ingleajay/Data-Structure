package com.recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int a[] = {1,3,5,9};
        System.out.println("Target ele index is : " + binarysearch(a,5,0,a.length-1));

    }

    private static int binarysearch(int[] a,int target,int s,int e) {
        if(s>e){
            return  -1;
        }

        int mid = s + ( e - s)/2;

        if(target < a[mid]){
            binarysearch(a,target,s,mid-1);
        }

        if(target == a[mid])
            return mid;

        return  binarysearch(a,target,mid+1,e);
    }
}
