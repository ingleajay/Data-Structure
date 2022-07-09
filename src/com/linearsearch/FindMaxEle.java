package com.linearsearch;

public class FindMaxEle {

	    // Easy : To find Maximum element from array
		public static void main(String[] args) {
			
			int a[] = {10,20,0,33};
			System.out.println("Maximum element  : " + max(a));

		}
		
		static int max(int a[]) {
			int max = a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i] > max)
				  max = a[i];
			}
			return max;
		}

}
