package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Easy : find intersection but distinict
//Link : https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
		System.out.println(Arrays.toString(intersection1(nums1, nums2)));

	}

	 public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        for (int i : nums1) {
	            set.add(i);
	        }

	        List<Integer> result = new ArrayList<>();

	        for (int i : nums2) {
	            if(set.contains(i)){
	                result.add(i);
	                set.remove(i);
	            }
	        }

	        int[] ints = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            ints[i]=result.get(i);
	        }
	        return ints;
	    }
	 
	 public static int[] intersection1(int[] nums1, int[] nums2) {
	        
	        List<Integer> m= IntStream.of(nums1).boxed().distinct().collect(Collectors.toList());
	        List<Integer>  n= IntStream.of(nums2).boxed().distinct().collect(Collectors.toList());
	        m.retainAll(n);
	        // converting ArrayList to array
	        return m.stream().mapToInt((i)->i).toArray();
	        
	    }
}
