package com.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {

	// Easy : Find Target Indices After Sorting Array
    // Link : https://leetcode.com/problems/find-target-indices-after-sorting-array/ 
	
	// 1. sorting 2.find start and end point of occu of target 3.print all ele from start to end  
	public static void main(String[] args) {
		int nums[] = {1,2,5,2,3};
		int target = 2;
		System.out.println(targetIndices(nums,target));

	}
	  public static List<Integer> targetIndices(int[] nums, int target) {
	        // sort array
	        Arrays.sort(nums);
	        
	        // empty list for storing integer
	        List<Integer> indices = new ArrayList<Integer>();
	        
	        // return index start and end
	    
	        int start = findindex(nums,target,true);
	        int end = findindex(nums,target,false);
	    
	        // store all data from start to end
	        for(int i=start;i<=end;i++){
	            if(start != -1 && end != -1)
	               indices.add(i);
	        }
	    
	        return indices;
	    }
	    
	    public static int findindex(int[] nums, int target,boolean firstocc){
	        
	       
	        int start = 0;
	        int end = nums.length-1;
	        int index = -1;
	    
	        while(start <= end){
	            // find mid ele
	            int mid = start  + ( end-start)/2;
	            if(target < nums[mid])
	                end = mid-1;
	            else if(target > nums[mid])
	                start = mid +1;
	            else{
	                 index  = mid;
	                if(firstocc){
	                    end = mid-1;
	                }
	                else{
	                    start = mid+1;
	                }
	            }
	        }
	        
	        return index;
	    }

}
