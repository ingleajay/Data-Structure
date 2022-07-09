package com.linearsearch;

public class FindMinEle {

	// Easy : To find Minimum element from array
	public static void main(String[] args) {
		
		int a[] = {10,20,0,33};
		System.out.println("Minimum element  : " + min(a));

	}
	
	static int min(int a[]) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] < min)
			  min = a[i];
		}
		return min;
	}

}
