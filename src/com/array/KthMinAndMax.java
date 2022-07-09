package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KthMinAndMax {

	public static void main(String[] args) {
		
		// Find Min and Max from array : 
		int arr[] = {10,4,3,3,11,8};
		int size = arr.length-1;
		int k = 2;
				
		// Approach 1: // only kth small element
		approach1(arr,size,k);
		
		// Approach 2: // only kth large element
		approach2(arr,size,k);
			    
		// Approach 3: // both kth max and min
		appraoch3(arr,size,k);
	}

	
    // T.C  = O(n^2)
	private static void appraoch3(int[] arr, int size, int k) {
		List<Integer> list = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		int j =1;
		int max=0,min=0;
		ArrayList<Integer> maxList = new ArrayList<Integer>(list);
		ArrayList<Integer> minList = new ArrayList<Integer>(list);
		while(j<=k) {			
			ArrayList<Integer> updatemaxList = new ArrayList<Integer>();
			ArrayList<Integer> updateminList = new ArrayList<Integer>();
			max =  maxList.stream().max((o1,o2)->o1-o2).get();
            min = minList.stream().min((o1,o2)->o1-o2).get();
            for(Integer p :maxList) {
            	if(p != max) {
            		updatemaxList.add(p);
            	}
            }
            for(Integer p :minList) {
            	if(p != min) {
            		updateminList.add(p);
            	}
            }
            maxList =updatemaxList;
            minList =updateminList;
		    j++;
		}	
		System.out.println("Max : " + max + " " + "Min : " + min);
	}

	// T.C = O(n)
	private static void approach2(int[] arr, int size, int k) {
		List<Integer> list1 = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		int i = 1;
		int s = list1.size()-1;
		while(i<k) {
		   Collections.sort(list1);
		   list1.remove(s);
		   s--;
		   i++;		  
		}
		System.out.println("Max : " + list1.get(s));
	}


	// T.C = O(n)
	private static void approach1(int[] arr, int size,int k) {
		List<Integer> list1 = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		int i = 1;
		int s = list1.size()-1;
		while(i<k) {
		   Collections.sort(list1);
		   list1.remove(0);
		   i++; 		  
		}
		System.out.println("Min : " + list1.get(0));
	}
}
