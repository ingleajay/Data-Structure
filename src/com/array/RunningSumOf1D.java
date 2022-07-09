package com.array;

import java.util.Arrays;

// Easy : Return the running sum of array.
// Link :https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1D {

	public static void main(String[] args) {
		int []nums = {1,2,3,4};
		int[] temp = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            temp[i] = sum;
        }
        System.out.println(Arrays.toString(temp));
	}

}
