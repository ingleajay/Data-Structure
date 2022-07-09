package com.linearsearch;

public class SearchEleIn2DArray {

	// Easy : Search target element is present in 2d array
	public static void main(String[] args) {
		
		int a[][] = {{100,20,70},{33,22,44,55}};
		int target = 70;
		int ischeck = search(a,target);
		if(ischeck < 0)
			System.out.println(target + " is not present in 2d array");
		else 
			System.out.println(target + " is present in 2d array");
	}

	private static int search(int[][] a, int target) {
		for(int[] row : a) {
			for(int col : row) {
				if(target == col)
					return 1;
			}
		}
		return -1;
	}

}
