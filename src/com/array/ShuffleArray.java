package com.array;

import java.util.Arrays;

// Easy : shuffle array
// link  :https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
	}

    public static int[] shuffle(int[] nums, int n) {
        
        int t[] = new int[2*n];
        int j = 0;
        int k = 1;
        while(j < 2*n && k<2*n){
            for(int i=0;i<n;i++){
               t[j] = nums[i];
               j  = j+2; 
            }
            for(int i=n;i<nums.length;i++){
               t[k] = nums[i];
               k = k + 2; 
            }  
        }
        return t;
    }
}
