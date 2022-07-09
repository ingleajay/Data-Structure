package com.binarysearch;

public class CelingOfLetter {

	// Easy : Ceiling of letter
	// link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
	public static void main(String[] args) {
	
	char[] letter = {'c','f','j'};
	char target = 'j';
	char ceilchar = nextGreatestLetter(letter,target);
    System.out.println("Ceiling char : " + ceilchar);
	}

    public static char nextGreatestLetter(char[] a, char target) {
    	int start =0;
		int end = a.length-1;
	
		// start<=end => should be in increasing order..
		while(start <= end) {
			
			//1. to find middle element
			int mid = start +((end - start)/2);

			// 2. check conditions 
			if(target < a[mid]) // search in left 
				end = mid-1; 
			else   // search in right 
				 start = mid +1; 
		}
		
		// it will check char is not found then return first char and if char has start and end value same then also return first char 
		// target = 'j' then return 'c'
		// target = 'z' then return 'c'
		
		return a[start % a.length];
    }
}
