package com.binarysearch;


// Hard : Mountain array
// https://leetcode.com/problems/find-in-mountain-array/submissions/

public class MinTargetIndexBeforeSort {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,10,11,1,0,-1};
		int len = a.length-1;
		int target = 0;
		System.out.println(find(a,len, target));
		
	}
	
    // used to find peak element
    public static int peakIndexInMountainArray(int[] arr) {
    	int start = 0;
    	int end = arr.length-1;
    	while(start < end) {
    		
        	int mid = start + ( end-start)/2;
        	
        	if(arr[mid] > arr[mid+1])
        		{
        		end = mid;
        		}
        	else {
        		start = mid+1;
        	}
    	}
    	return start;
    }
	
	public static int find(int[] a, int len, int target) {
		// mid ele 
        int start = 0;
        int end = len;
        
        // find peak ele and on the basis of this to get two sub array - left and right
        int mid = peakIndexInMountainArray(a);
        
        // left array :
        int left = binarysearch(a,0,mid,target,true);
        
        // right array
        int right = binarysearch(a,mid+1,end,target,false);
        
        int min =0;
        
        // used to find out minimum element from two index- left and right
        if(left < right && left != -1 && right != -1){
            min = left;
        }
        else{
            min = right;
        }
        
        if(left == -1)
            min = right;
        else
            min = left;
        
        return min;
	}
	
	// used to search target and ele and return index
	 public static int binarysearch(int[] a, int start, int end, int target, boolean check){
	        while(start <= end){
	            int mid = start + (end-start)/2;
	            if(target == a[mid])
					return mid;
	            
	            if(check == true) {
	            
		            if(target < a[mid]){
		                end = mid-1;
		            }
		            else{
		                start = mid+1;
		            }
	            }
	            else {
	            	  if(target > a[mid]){
			                end = mid-1;
			            }
			            else{
			                start = mid+1;
			            }
	            }
	        }
	        return -1;
	    }

}
