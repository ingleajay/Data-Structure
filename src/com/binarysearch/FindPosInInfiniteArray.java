package com.binarysearch;

public class FindPosInInfiniteArray {

	//Hard :  To find position of element in infinite array
	// Amazon question
	public static void main(String[] args) {
		
		// use increaing window concept and after that binary search
		// infinite array means there is no array length define
		// find start and end value 
		
		// it's just example array so it can be inifite array
		int[] a = {2,3,4,5,6,7,8,9,10,11,12,33,55,77,88,99,101,102,109,200};
		int target = 11;
		System.out.println(result(a, target));
		
	}
	
	static int result(int a[], int target) {
		
		// intially start is 0 and end is 1 because it will grow it's window by double
		
		int start = 0;
		int end = 1;
		
		// condition for target will lie in range
		while(target > a[end]) {
			
			// cal new start value
			int temp = end +1;
			
			// double the window size
			// new window = size of new window + previous end 
			end = (end-start + 1)*2 + end;
			
			// it will start with new start pointer
			start = temp;
		}
		
		return search(a,target,start,end);
		
	}
	
	public static int search(int[] a, int target, int start, int end ) {
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
