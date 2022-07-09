package com.array;

import java.util.Arrays;

// Easy : To do concatention of array
// Link : https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationofArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,1};
		approach1(a);
		approach2(a);

	}

	private static void approach2(int[] nums) {
		int[] t = new int[2*nums.length];
        int j=nums.length;
        int[] a = nums;
        for(int i=0;i<nums.length;i++){
            t[i] = nums[i];
            t[j] = a[i];
            j++;
        }
        System.out.println(Arrays.toString(t));
	}

	private static void approach1(int[] nums) {
		int[] t = new int[2*nums.length];
        int j=nums.length;
        for(int i=0;i<nums.length;i++){
            t[i] = nums[i];
            t[i+j] = nums[i];
        }
        System.out.println(Arrays.toString(t));
		
	}

}
