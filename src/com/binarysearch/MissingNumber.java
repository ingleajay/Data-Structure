package com.binarysearch;

import java.util.Arrays;

public class MissingNumber {
	// Easy : Missing Number
	//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	// https://leetcode.com/problems/missing-number/

	public static void main(String[] args) {
		int[] a = {3,0,1};
		int s = missingNumber(a);
		System.out.println(s);
	}
	 public static int missingNumber(int[] a) {
	        int end = a.length-1;
	        int start = 0;
	    
	        Arrays.sort(a);
	        System.out.println(Arrays.toString(a));
	        while(start <= end) {
				
				int mid = start +((end - start)/2);
				if(mid == a[mid]){
					 start = mid +1;
	                System.out.println("if strat "+start);
	                 
	            }
	            if(mid != a[mid]){
					 end = mid-1;
	                System.out.println("if end "+end);
	            }
	    }
	   return start;
}
}
