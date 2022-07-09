package com.linearsearch;

public class SearchEleInRange {

	// Easy : Find target element is present in given range
	public static void main(String[] args) {
		
		int a[] = {10,20,48,33,44,22,66,99};
		int target = 22;
		int start = 4;
		int end = 6;
		boolean ischeck = search(a, target,start,end);
		
		if(ischeck == true)
		 System.out.println(target + " is present in given range ");
		else
		 System.out.println(target + " is not present in given range ");

	}
	
	static boolean  search(int a[], int target, int start, int end) {
		
		// we have to check array is empty or not 
		if(a.length < 0)
			System.out.println("Array can not be empty");
		
		for(int i=start;i<end;i++) {
			if(target == a[i])
				return true;
		}
		
		// this return will work if target is not match in array ele
		return false;
	}

}
