package com.binarysearch;

public class PeakIndex {

	// Easy : Peak Index in a Mountain Array
	// link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
	// array should be mountain or bitonic array.
	public static void main(String[] args) {
		
		int[] a = {11,1};
		int m = peakIndexInMountainArray(a);
		System.out.println(m);
	}
	
    public static int peakIndexInMountainArray(int[] arr) {
        
    	// find mid
    	int start = 0;
    	int end = arr.length-1;

    	// start always less than end  because mid ele can be found at when start == end
    	// so loop break condition will be start < end
    	while(start < end) {
    		
    		// to find mid element
        	int mid = start + ( end-start)/2;
        	
        	// this condition is for check mid element is greater than right side of array
        	// if yes then you can make end = mid
        	if(arr[mid] > arr[mid+1])
        		{
        		end = mid;
        		}
        	
        	// it's check if mid is less than left side of array
        	// if yes then you can make start = mid+1
        	else {
        		start = mid+1;
        	}
    	}
    	
    	// you can return start or end it doesn't matter
    	return start; // or return end;
    }
    
    // linear search = O(n)
     public int peakIndexInMountainArray1(int[] arr) {
        
        int max = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
