package com.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// fibo = 0 1 2 3 5 8 13 
		int n = 51;

		// by akra bazzi
		System.out.println(fibo1(n));

		int res = fibo(n);
		System.out.println(res);
	}

	private static long fibo1(int n) {
		return (long)(Math.pow(((1+Math.sqrt(5))/2),n)/ Math.sqrt(5));
	}

	private static int fibo(int n) {
		if(n == 0 || n==1) {
			return n;
		}
		else {
			int res = fibo(n-1)+fibo(n-2);
			return res;
		}
	}

}
