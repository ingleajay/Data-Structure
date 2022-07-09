package com.recursion;

public class SumOfAllNo {

	public static void main(String[] args) {
	
		int no = 6;
		int res = sumAllNo(no);
		System.out.println("Sum of no from range : " + res);

	}

	private static int sumAllNo(int no) {
		if(no ==0) {
			return 0;
		}else {
			return no+sumAllNo(no-1);
		}
	}
	
	// 7 , 6 , 5, 

}
