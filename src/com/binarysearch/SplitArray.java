package com.binarysearch;

// Hard : to 

public class SplitArray {

	public static void main(String[] args) {

		int a[] = { 7,2,5,10,8};
	
		int m = 2;
		int res = splitArray(a,m);
		System.out.println(res);
		
	}
	
	 public static int splitArray(int[] nums, int m) {
			int start = 0;
			int end =0;  
			for(int i=0;i<nums.length;i++) {
				
				// largest number from array
				start = Math.max(start, nums[i]);
				
				// sum of array 
				end = end + nums[i];
			}
			
			// binary search 
			while(start < end) {
				
				// try for middle as ans
				int mid = start + (end-start)/2;
				
				// cal how many pieces you can divide this max sum
				int sum = 0;
				int pieces = 1;
				
				for(int num : nums) {
					if(sum+num > mid) {
						
						// you can not add this is in subarray , make new one
						// say you add this sum in new subarray,sum=num
						
						sum = num;
						pieces++;
					}
					else {
						sum = sum + num;
					}
				}
				
				if(pieces > m) {
					start = mid+1;
				}
				else {
					end = mid;
				}
			}
			return start;
	 }
}
