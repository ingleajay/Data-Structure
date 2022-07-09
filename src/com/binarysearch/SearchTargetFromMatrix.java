package com.binarysearch;

// Easy : Find target ele from matrix if row and col is sorted

public class SearchTargetFromMatrix {

	public static void main(String[] args) {

		int a[][] = {{10,20,30},{11,22,33},{12,23,34}};
		int target = 10;
		
		int s = searchEle(a, target);
		System.out.println(s);
	}

	private static int searchEle(int[][] a, int target) {
		
		int start = 0;
		int end = a.length-1;
	
		int row=0; int col=0;
		while(start<= end) {
			
			int mid = start + ( end - start)/2;
			
			if(target < a[row][mid])
				end = mid -1;
				
			else
				start = mid + 1;
			
			row++;
			
			if(target == a[row][mid])
				{System.out.println(row + " " + mid + " " + col);
				return a[row][mid];}
		}
		return -1;
	}
}
