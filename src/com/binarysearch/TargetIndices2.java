package com.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetIndices2 {

	// Easy : Find Target Indices After Sorting Array
	// Link : https://leetcode.com/problems/find-target-indices-after-sorting-array/ 
	
	// 1. sorting 2. to find mid element from sub array and return 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,5,2,3};
		int target = 2;
		System.out.println(targetIndices(nums,target));
	}
	
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        helper(nums, 0, nums.length-1, target, list);
        Collections.sort(list);
        return list;
    }
    
    public static void helper(int[] nums, int start, int end, int target, List<Integer> list){
        if(start > end) return;
        int mid = (start + end)/2;
        if(nums[mid] == target){
            list.add(mid);
        }
        helper(nums, start, mid-1, target, list);
        helper(nums, mid+1, end, target, list);
    }

}
