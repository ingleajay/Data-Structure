package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnionAndIntersection {
	
	// count of union and intersection

	public static void main(String[] args) {
		int arr1[] = {10,4,3,3,11,8,6};
		int arr2[] = {10,2,4};
		int size1 = arr1.length-1;
		int size2 = arr2.length-1;
		
		approach1(arr1,arr2);
		approach2(arr1,arr2,size1,size2);
	}

	
	private static void approach2(int[] arr1, int[] arr2, int size1, int size2) {
		int[] newArr = new int[size1+size2+2];
		int i=0;
		while(i<=size1) {
			newArr[i] = arr1[i];
			i++;
		}
		int k = 0;
		for(int j=i;j<=newArr.length-1;j++) {
			newArr[j] = arr2[k];
			k++;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int p=0;p<=newArr.length-1;p++) {
			if(!set.contains(newArr[p])) {
				set.add(newArr[p]);
			}
		}
		int unioncount = set.size();
		System.out.println(unioncount);
		
		intersection(arr1,arr2);
		
	}

	private static void intersection(int[] arr1, int[] arr2) {
		
		
	}


	// use collection 
	private static void approach1(int[] arr1, int[] arr2) {

		List<Integer> m = IntStream.of(arr1).boxed().collect(Collectors.toList());
		List<Integer> n = IntStream.of(arr2).boxed().collect(Collectors.toList());
		m.addAll(n);
		long unionCount  = m.stream().distinct().count();
		System.out.println("Union Count - "  + unionCount);
		
		List<Integer> p = IntStream.of(arr1).boxed().collect(Collectors.toList());;
        n.retainAll(p);
        long intersectionCount  = n.stream().distinct().count();
		System.out.println("Intersection Count - " + intersectionCount);
	}
	
	
	
}
