package com.binarysearch;

// find out no of rotation for sorted rotated array
public class NoofRotationInSortedArray {

	public static void main(String[] args) {
		int[] a = {3,3,4,5,1,2,3};
		int pivot = pivotindex(a);
		System.out.println(pivot+1);
		
	}

	// this will not work for duplicate value
    private static int pivotindex(int[] a) {
    	int start = 0;
    	int end = a.length-1;
    	while(start < end) {
    		int mid = start + ( end - start)/2;
    		
    		// pivot ele will be large number so 
    		
    		// case 1: if mid ele is larger than next number then mid is pivot and
    		// also mid < end because mid+1 can be exceed
    		if(mid<end && a[mid]>a[mid+1])
    			return mid;
    		
    		// case 2: if mid ele is less than previous number then mid-1 is pivot and
    		if(mid>start && a[mid] < a[mid-1])
    			return mid-1;
    		
    		// case 3 : in array first half of array is sorted and after that decrasing order so 
    		// we know pivot is large so ignore rest half of array in if condition
    		// else part - if your large ele present after it then check after mid so start = mid + 1
    		
    		// all element from mid will be less than start so just ignore that ele and do e = mid-1
    		// ex. 4,5,6,3,2,1,0 => mid = 3 after mid =>  a[mid]<= a[start] for ignore - e = mid-1
    		if(a[mid] <= a[start])
    			end = mid-1;
    		else
    	    // ex. 3,4,5,6,2 => mid = 2 after mid evey ele > start so ignore start = mid+1		
    			start = mid+1;
    			
    				
    	}
    	return -1;
	}

	
}
