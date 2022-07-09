package com.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {

	// Medium : Find First and Last Position of Element in Sorted Array
	// link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	// Facebook Question
	public static void main(String[] args) {
		
		int[] a = {5,8,8,9,10,11};
		int target = 8;
		int[] res = searchRange(a,target);
		System.out.println(Arrays.toString(res));
		
	}
	
	public static int[] searchRange(int[] a, int target) {
		
		int[] position = {-1,-1};
		
		// this is for start position
		position[0] = result(a, target, true);
		if(position[0] != -1) {
			// this is for end position
		    position[1] = result(a, target, false);
		}
		return position;
	}
	

	public static int result(int[] a, int target,boolean firstocc) {
		
		// initially return index is nothing
		int ans = -1;
		
		int start =0;
		int end = a.length-1;
	
		while(start <= end) {
			
			
			//1. to find middle element
			int mid = start +((end - start)/2);
			
			// 2. check conditions 
			if(target > a[mid]) // search in right 
				 start = mid +1;
			else if(target < a[mid]) // search in left
				 end = mid-1;
			else // search mid
				{   
				    // if mid find then ans = mid
					ans = mid;
					
					// it might be possible that first occ will be present before mid ele
					if(firstocc == true) {
						end = mid -1;
					}
					// it might be possible that first occ will be present after mid ele
					else {
						start = mid+1;
					}
				}
		}

		return ans;

	}
}
