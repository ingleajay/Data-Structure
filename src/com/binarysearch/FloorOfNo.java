package com.binarysearch;

public class FloorOfNo {

	// Easy : To find floor of number in array
	// Floor no = greatest element from array which smaller or equal >= target ele
	// ex. a = [2,,5,9,14,19]
	// target = 13
	// floor no = sub array which ele <= 13 = [2,5,9] = (9<=13) => greatest no => 9

	// here at last condition like - end <= target <= start => end is smaller element than end so return end
	// T.C = O(logn)
	
	public static void main(String[] args) {
		
		int a[] = {1,4,5,7,9,14,16,18};
		int target = 0;
		System.out.println(floorofno(a,target));
		
	}

	private static int floorofno(int[] a, int target) {
		
		int start =0;
		int end = a.length-1;
		
		// if target number is smallest than array element
		if(target < a[a.length-1]) {
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
		// floor value return
		return a[end];
	}

}
