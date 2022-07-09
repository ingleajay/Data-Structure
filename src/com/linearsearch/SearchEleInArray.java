package com.linearsearch;

// Linear search  : It is process to find given element in array
// best case : O(1) => element is found in first place 
// worst case : O(n) => element is found at last or not found in array


public class SearchEleInArray {

	// Easy : Find number is exist or not in array
	public static void main(String[] args) {
		
		int a[] = {10,20,48,33};
		int target = 50;
		
		boolean ischeck = search(a, target);
		
		if(ischeck == true)
		 System.out.println(target + " is present in array ");
		else
		 System.out.println(target + " is not present in array ");

	}
	
	static boolean  search(int a[], int target) {
		
		// we have to check array is empty or not 
		if(a.length < 0)
			System.out.println("Array can not be empty");
		
		for(int i=0;i<a.length;i++) {
			if(target == a[i])
				return true;
		}
		
		// this return will work if target is not match in array ele
		return false;
	}
}
