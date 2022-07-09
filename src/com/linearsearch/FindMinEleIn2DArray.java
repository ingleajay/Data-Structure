package com.linearsearch;

public class FindMinEleIn2DArray {

	// Easy : To find Min element in 2d array
	public static void main(String[] args) {
		
		int a[][] = {{100,20,70},{33,22,44,55}};
		System.out.println("Minimum element from 2d array (for-loop)  : " + min(a));
		System.out.println("Minimum element from 2d array (for-each)  : " + min1(a));
	}

	private static int min1(int[][] a) {
		int min = a[0][0];
		for(int[] row : a) {
			for(int col : row) {
				if(col < min)
					min = col;
			}
		}
		return min;
	}

	private static int min(int[][] a) {
		
		int min = a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j] < min)
					min = a[i][j];
			}
			
		}
		return min;
	}

}
