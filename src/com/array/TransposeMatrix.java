package com.array;

import java.util.Arrays;

// Easy : find transpose of matrix of any
// Link : https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {

	public static void main(String[] args) {

		int a[][] = {{1,2,3},{4,5,6}};
		int row = a.length;
        int col = a[0].length;
        int[][] t =new int[col][row];
        for(int i = 0; i<row;i++){
            for(int j=0;j<a[i].length;j++){
                t[j][i] = a[i][j];
            }
        }
        for(int[] i : t) {
        System.out.println(Arrays.toString(i));
        }
	}

}
