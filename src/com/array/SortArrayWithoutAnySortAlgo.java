package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArrayWithoutAnySortAlgo {

	public static void main(String[] args) {
		
		// array contains only 0,1,2 numbers 
		int arr[] = {0,2,0,0,1};
		int size = arr.length;
		
		approach2(arr,size);
		approach3(arr,size);
		
		int[] sortedarr = approach1(arr,size);
		System.out.println(Arrays.toString(sortedarr));
		
	}

	// T.C  = O(n) => use collection and java 8 => short method
	private static void approach3(int[] arr, int size) {
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		ArrayList<Integer> newList = new ArrayList<Integer>();
		long zeroCount  = list.stream().filter((i) -> i == 0).count();
		count(zeroCount,newList,0);
		long oneCount  = list.stream().filter((i) -> i == 1).count();
		count(oneCount,newList,1);
		long twoCount  = list.stream().filter((i) -> i == 2).count();
		count(twoCount,newList,2);
		System.out.println(newList);
	}

	private static void count(long count, ArrayList<Integer> newList, int ele) {
		for (int i=0;i<count;i++) {
			newList.add(ele);
		}
	}

	// T.C  = O(n)+O(n)+O(n) = 3*O(n) , use collection and java 8 => long method
	private static void approach2(int[] arr, int size) {
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i=0;i<size;i++) { // O(n)
			int e = list.get(i);
			if(e == 0) {
				newList.add(e);
			}
		}
		for(int i=0;i<size;i++) { // O(n)
			int e = list.get(i);
			if(e == 1) {
				newList.add(e);
			}
		}
		for(int i=0;i<size;i++) { // O(n)
			int e = list.get(i);
			if(e == 2) {
				newList.add(e);
			}
		}
		System.out.println(newList);
	}

	// T.C = O(n^2) => use swap tech
	private static int[] approach1(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}

}
