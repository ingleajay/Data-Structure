package com.binarysearch;

public class OrderAgnosticBS {

	// It doesn't matter your array containes ascending or descending order of element
	public static void main(String[] args) {
	
		//int a[] = {2,4,6,9,11,12,14,20,36,48};
		int a[] = {100,36,22,14,16,19,11,10,1};
		int target = 36;
		
		int index=binarysearch(a,target);
		if(index>0)
			System.out.println(target + " is found at index " + index);
		else
			System.out.println(target + " is not found in array");
	}
	
	private static int binarysearch(int[] a, int target) {
		
		int start =0;
		int end = a.length-1;
		
		// check array is in asec or desc order
		boolean isAsec = a[start] < a[end];
		
		// start<=end => should be in increasing order..
		while(start <= end) {
			
			//1. to find middle element
			// mid = (start+end)/2 => it might be exceed for large no of inputs in future.
			int mid = start +((end - start)/2);
			
			if(target == a[mid])
				return mid;
			
			// 2. check conditions 
			if(isAsec) {
				if(target > a[mid]) // search in right 
					 start = mid +1;
				else // search in left
					 end = mid-1;
			}
			else {
				if(target < a[mid]) // search in right 
					 start = mid +1;
				else // search in left
					 end = mid-1;
			}
		}
		// if there is no element 
		return -1;
	}
}
