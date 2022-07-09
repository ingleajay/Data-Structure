package com.binarysearch;

import java.util.Arrays;

// Easy : To find target ele in sorted row and sorted col of matrix
// T.C = O(n) = n + n-1 = 2n
public class SearchEleIn2DSortedArray {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{5,6}};
		int target = 3;
		
		System.out.println(Arrays.toString(serach(a, target)));
	}
	
	public static int[] serach(int[][] m , int target) {
		
		int row = 0;
		int col = m.length-1;
		
		// we will go from row to till end and we will move from last col to start col
		while(row < m.length && col>=0) {
			
			// if target == ele then return
			if(m[row][col] == target)
				return new int[] {row,col};
			
			// if target > ele then your ele might be present row if not then skip that row
			if(m[row][col] < target)
				row++;
			
			// if target < ele then your ele might be present col if not then skip that col
			else
				col--;
		}
		return new int[] {-1,-1};
	}
}
