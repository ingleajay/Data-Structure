package com.array;

import java.util.Arrays;

//Easy : 
/* 
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/
// Link : https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressRunLengthEncodedList {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(decompressRLElist(new int[]{1,2,3,4})));
		
	}
	
    public static int[] decompressRLElist(int[] nums) {
        
    	// count your length of result array 
        int len = 0;
        int m = 0;
        for(int i =0; i<nums.length;i++){
            if (i%2 ==0){
                len  = len+nums[i];
                m++;
            }   
        }
        int t[] = new int[len];
        
        
        int p = 0;
        for(int i =0; i<m;i++){
            int c=0;
            
            // 2*i is for freq 
            // 2*i+1 is for value
            while(c < nums[2*i] ){
                if(p<len){
                    t[p++] = nums[2*i+1];
                }
                c++;
            }
        }
        return t;
    }

}
