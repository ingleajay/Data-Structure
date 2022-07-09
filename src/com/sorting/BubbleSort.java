package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5};
		sort(a);
		modifiedBubbleSort(a);
	}

	private static void modifiedBubbleSort(int[] a) {
		boolean swapped = false;
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				System.out.println(i + " " + j);
				if(a[j] < a[j-1]) {
					int t  = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					swapped = true;
				}
			}
			
			// if there is no swap in first pass it means your array is soreted 
			// so come out of loop 
			if(!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		
		// i is for number of passes 
		// j is for number of comprasion done in i passes = n-i-1
		// best case = O(n^2) and worst case = n^2 
		
		// because if array is sorted then also it working like worst case so we need 
		// modifiable bubble sort because if array is sorted it means we just check
		// in first pass no need to go and check other passses right so if in first passes there
		// is no swaps it means array is sorted 
		
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				System.out.println(i + " " + j);
				if(a[j] < a[j-1]) {
					int t  = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
