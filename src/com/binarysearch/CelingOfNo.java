package com.binarysearch;

public class CelingOfNo {

	// Easy : To find ceiling of number in array
	// Ceiling no = smallest element from array which largest or equal >= target ele
	// ex. a = [2,,5,9,14,19]
	// target = 13
	// ceiling no = sub array which ele >= 13 = [ 14,19] = (14>=13) => small no => 14
	
	// here at last condition like - end <= target <= start => start is greater elemnt than end so return start
	// T.C = O(logn)
	
	public static void main(String[] args) {
		
		int a[] = {1,4,5,7,9,14,16,18};
		int target = 10;
		System.out.println(ceilingno(a,target));
		
	}

	private static int ceilingno(int[] a, int target) {
		
		int start =0;
		int end = a.length-1;
		
		// if target number is greater than array element
		if(target > a[a.length-1]) {
			return -1;
		}
		
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
				return a[mid];
		}
		// ceiling value return 
		return a[start];
	}

}
