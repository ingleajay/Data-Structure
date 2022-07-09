package com.binarysearch;

import java.util.Arrays;

public class SearchInArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,6,9,11,12,14,20,36,48};
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
		
		
		// start<=end => should be in increasing order..
		while(start <= end) {
			
			//1. to find middle element
			// mid = (start+end)/2 => it might be exceed for large no of inputs in future.
			int mid = start +((end - start)/2);
			
			// 2. check conditions 
			if(target > a[mid]) // search in right 
				 start = mid +1;
			else if(target < a[mid]) // search in left
				 end = mid-1;
			else // search mid
				return mid;
		}
		// if there is no element 
		return -1;
	}
}
