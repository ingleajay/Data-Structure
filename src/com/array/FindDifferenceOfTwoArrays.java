package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDifferenceOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,3};
	    int[] nums2 = {1,2,8,9};
	    findDifference(nums1,nums2);
	}

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
    	List<Integer> l1 = IntStream.of(nums1).boxed().distinct().collect(Collectors.toList());
    	List<Integer> l2 = IntStream.of(nums2).boxed().distinct().collect(Collectors.toList());
    	List<Integer> l3 = IntStream.of(nums1).boxed().distinct().collect(Collectors.toList());

    	
    	l3.retainAll(l2);
    	System.out.println(l3 + " " + l1 + " " + l2);
    	
    	
    	for(int i : l1) {
    		for(int j : l2) {
    		   l1.remove(j);
    		}
    	}

    	System.out.println(l1);
    	
    	
    	List<Integer> ans1 = new ArrayList<Integer>();
    	
    	
    	
    	System.out.println(ans1);

    	return null;
    }
}
