package com.linearsearch;

public class FindEvenNoOfDigits {

	// Easy : In given array - how many of them contain an even number of digits.
	// link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
	
	public static void main(String[] args) {
		
		int a[] = {12,345,2,6,7896};
		int count = findNumbers(a);
		System.out.println(count + " numbers has even no of digits");
		

	}

	private static int findNumbers(int[] a) {
		
		// calculate length or digits of each number 
		int count = 0;
		for(int no : a) {
			// int digit = String.valueOf(no).length(); // it takes much time == 4ms
			int digit = (int)(Math.log10(no))+1; // it takes less time  == 2ms
			if(digit%2 ==0)
				count++;
		}
		return count;
	}

}
