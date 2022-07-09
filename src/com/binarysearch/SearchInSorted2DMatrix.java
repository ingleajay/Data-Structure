package com.binarysearch;

import java.util.Arrays;

public class SearchInSorted2DMatrix {

	public static void main(String[] args) {
		
	   int[][] a = {
			   {10},
			   
	   };
		
	   System.out.println(Arrays.toString(search(a, 0)));
	}
	
	// write binary search for your four parts of matrix
	public static int[] binarysearch(int[][] m , int row, int cStart, int cEnd,int target) {
		
		while(cStart <= cEnd) {
			
			// find mid 
			int mid = cStart + (cStart-cEnd)/2;
			
			// if target ele is equal to than row of mid
			if(m[row][mid] == target) {
				return new int[] {row,mid};
			}
			
			// if target ele is greater than row of mid
			if(m[row][mid] < target) {
					cStart = mid+1;
			}
			else {
				cEnd = mid-1;
			}
			
			
		}
		return new int[] {-1,-1};
		
	}
	
	static int[] search(int[][] m, int target) {
		
		int row = m.length;
		int col = m[0].length;
		
		// if there is one ele in matrix
		if(row == 1)
		{
			binarysearch(m,0,0, col-1, target);
		}
		
		int rStart = 0;
		int rEnd = row-1;
		int cMid = col/2;
		
		while(rStart < rEnd-1) {
			int mid = rStart + (rEnd - rStart)/2;
			
			if(m[mid][cMid] == target) {
				return new int[] {mid,cMid};
			}
			
			if(m[mid][cMid] < target)
				rStart = mid;
			else
				rEnd = mid;
		}
		
		// check the target is in the col of 2 rows
		
		// if your column of mid ele is target then
		if(m[rStart][cMid] == target)
			return new int[] {rStart,cMid};
		
		if(m[rStart+1][cMid] == target)
			return new int[] {rStart+1,cMid};
		
		
		// we have four part or corners 
		
		// 1st half 
		if(target <= m[rStart][cMid-1])
			return binarysearch(m, rStart,0, cMid-1, target);
		
		if(target >= m[rStart][cMid+1] && target <= m[rStart][col-1])
			return binarysearch(m, rStart,cMid+1, col-1, target);
		
		if(target <= m[rStart+1][cMid-1])
			return binarysearch(m, rStart+1,0, cMid-1, target);
		else
		    return binarysearch(m, rStart+1,cMid+1, col-1, target);
	}

}
