package com.linearsearch;

import java.util.Arrays;

public class MaximumWealth {

	// Easy : A customer's wealth is the amount of money they have in all their bank accounts. 
	// The richest customer is the customer that has the maximum wealth.
	
	//link : https://leetcode.com/problems/richest-customer-wealth/
	public static void main(String[] args) {
		
		int accounts[][] = {{1,5},{7,3},{3,5}};
		System.out.println("Maximum Wealth : " +findMaxWealth(accounts) );
	}

	private static int findMaxWealth(int[][] accounts) {
		int max  = 0;
		for(int[] p : accounts) {
			int sum = 0;
			
			// take every time new sum for 1D array
			for(int acc : p) {
				sum = sum + acc;
			}
			
			// check max value from sum 
			if(sum > max)
				max = sum;
		}
		return max;
	}


}
