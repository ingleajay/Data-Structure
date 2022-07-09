package com.recursion;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n = -1;
		int res = sumOfDigit(n);
        System.out.println("Sum of all digit : " + res);
	}

	private static int sumOfDigit(int n) {
		int sum = 0;
		if(n>0) {
			sum = n%10 + sumOfDigit(n/10);
			return sum;
		}
		return n==0 || n<0 ? 0 : 1;
	}

	// sum = 4+s(123)
	// sum = 4+3+s(12)
	// sum = 4+3+2+s(1)
	// sum = 4+3+2+1+s(0)
	// sum = 4+3+2+1+0 = 10
	
}
