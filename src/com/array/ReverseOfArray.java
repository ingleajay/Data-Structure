package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		// reverse of array : 
		int arr[] = {10,4,3,11,8};
		int size = arr.length-1;
		
		// Approach 1:
		approach1(arr,size);
		
		// Approach 2:
		approach2(arr,size);
		
		// Approach 2 : 
		int a[] = approach3(arr, size);
		System.out.println(Arrays.toString(a));
		
		
		
		
	}



	// T.C = O(n) => Use Swapping technique
	private static int[] approach3(int[] arr, int size) {
		System.out.println("Approach 3 : ");
		for(int i=0;i<size;i++) {
			int t  = arr[i]; // t = 10 
			arr[i] = arr[size]; // arr[0] = 8
			arr[size] = t; // arr[4] = 10
			size--;
		}
		return arr;
	}
	

	// T.C => O(n) => use Collection and java 8
	private static void approach2(int[] arr, int size) {
		System.out.println("Approach 2 : ");
		// boxed - every element should be integer in array
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
	}

	// T.C => O(n) => use reverse technique
	private static void approach1(int[] arr, int size) {
		System.out.println("Approach 1 : ");
		for(int i=size;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

}
