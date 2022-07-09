package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {4,6,1,0,2,3};
		approach1withMin(a);
		System.out.println("+++++++++++++++++++++++");
		approach1withMax(a);
	}

	private static void approach1withMax(int[] a) {
		for(int i=0;i<a.length;i++) {
			int last = a.length-i-1;
			// find max element 
			int max = getMax(a,0,last);
			swap(a, max,last);
		}
		System.out.println(Arrays.toString(a));
		
	}

	private static int getMax(int[] a, int start, int end) {
		int max = start;
		for(int j=start;j<=end;j++) {
			if(a[max] < a[j])
				max = j;
		}
		System.out.println(start + " " + end + " " + a[max]);
		return max;
	}

	private static void approach1withMin(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			int last = a.length-1;
			int start = last-i;
			
			// find min element 
			int min = getMin(a,start,last);
			swap(a,start,min);
		}
		System.out.println(Arrays.toString(a));
	}

	private static int getMin(int[] a, int start, int end) {
		int min = start;
		for(int j=start;j<end;j++) {
		   if(a[min] > a[j]) {
			   min = j;
		   }
		}
		System.out.println(start + " " + end + " " + a[min]);
		return min;
	}
	
	private static void swap(int[] a, int first, int second) {
		int t = a[first];
		a[first] = a[second];
		a[second] = t;
	}

}
