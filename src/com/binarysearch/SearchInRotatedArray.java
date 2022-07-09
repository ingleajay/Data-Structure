package com.binarysearch;

public class SearchInRotatedArray {

	// Meduim : To search ele in rotated sorted array
	// ex. [ 0,1,2,5,6,7] 
	// after 1 rotation : [7,0,1,2,5,6]
	// after 2 rotation : [6,7,0,1,2,,5]
	// after 3 rotation : [5,6,7,0,1,2]
	// here in this what is pivot ele : is largest ele
	// apply binary search on the both side - both side is asecending
	
	// Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
	public static void main(String[] args) {
		int[] a = {3,4,5,3,3,1};
		int target = 1;
		
		int res = ans(a,target);
		System.out.println(res);
		
	}
	
	public static int ans(int[] a, int target){
        int pivot = pivotindexforduplicates(a);
		
		// if pivot is not found it means it's not rotated sorted array
		if(pivot == -1)
			return binarysearch(a, 0,a.length-1,target);
		
		// if pivot found then you have 2 sorted array
		
		// case 1 : if pivot ele is your target ele then return pivot index only
		if(a[pivot] == target)
			return pivot;
		
		// case 2 : if target ele is greater than start ele then search 
	      
		if(target >= a[0]) {
			// all ele after pivot is smaller than start
			return binarysearch(a,0, pivot-1, target);
		}
		
		// if target < start 
		return binarysearch(a,pivot+1,a.length-1, target);
	}
	
    public static int binarysearch(int[] a, int start, int end, int target) {
    	
		while(start<=end) {
			int mid = start + ( end - start)/2;
			if(target == a[mid])
				return mid;
			if(target < a[mid])
				end = mid-1;
			else
				start = mid+1;

		}
		return -1;
        
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

    
 // this will  work for duplicate value as well
    private static int pivotindexforduplicates(int[] a) {
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
    		
    		// case3 : 
    		if(a[mid] == a[start] && a[mid] == a[end]) {
    			// skip the duplicated
    			// note : what if these ele at start and end were the pivot ? 
    			
    			// check start is pivot or not
    			if(a[start] > a[start+1])
    				return start;
    			
    			// skip start ele
    			start++;
    			
    			// check end is pivot or not
    			if(a[end] < a[end-1])
    				return end-1;
    			
    			end--;
    		}
    		// left side is sorted then pivot is in right side
    		else if(a[start] < a[mid] || (a[start]==a[mid] && a[mid]>a[end])) {
    			start=mid+1;
    		}
    		else {
    			end  = mid-1;
    		}
    				
    	}
    	return -1;
	}
	

}
