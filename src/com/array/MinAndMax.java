package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMax {

	public static void main(String[] args) {
		
		// Find Min and Max from array : 
		int arr[] = {10,4,3,3,11,8};
		int size = arr.length-1;
		
		// Approach 1:
	    approach1(arr,size);
	    
	   // Approach 2:
	    approach2(arr,size);
	}

	// T.C => O(n) => use normal approach
	private static void approach2(int[] arr, int size) {
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<=size;i++) {
			if(min > arr[i]) {
				min  = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Max : " + max + " " + "Min : " + min);
	}

	// use Sorting tech by Collection and java 8
	private static void approach1(int[] arr, int size) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println("Max : " + list.get(size) + " " + "Min : " + list.get(0));
	}
}
