package com.array;

import java.util.Arrays;

public class FindPlusOne {
	/*
	 * Easy : You are given a large integer represented as an integer array digits,
	 * where each digits[i] is the i th digit of the integer. The digits are ordered
	 * from most significant to least significant in left-to-right order. The large
	 * integer does not contain any leading 0's.
	 * Increment the large integer by one and return the resulting array of digits.
	 */
	
	// link : https://leetcode.com/problems/plus-one/
		
	// Normal Question
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = {9};
         int arr[] = plusOne(a);
         System.out.println(Arrays.toString(arr));
	}
	
	public static int[] plusOne(int[] d) {
        for(int i=d.length-1; i>=0; i--){ // start from last index
        	//we want lastindex value has to add 1
            if(d[i] < 9){ //if lastindex value has to greater than 10
                d[i] = d[i] + 1; //add lastindex value + 1
                break;
            }else{
            	//if lastindex value has to greater than 10
                d[i] = 0;
            }
        }
        
        //if zero index value has zero 
        if(d[0] == 0){
            int[] ud = new int[d.length+1]; // add one more array length to store zero value
            ud[0] = 1; // at zero index put one
            return ud;
        }
        return d;
    }

}
