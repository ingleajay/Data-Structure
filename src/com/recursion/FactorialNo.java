package com.recursion;

import java.math.BigInteger;

public class FactorialNo {
	
	// Fact = n = n*(n-1)!

	public static void main(String[] args) {
		
		int n = 11;
		BigInteger no = BigInteger.valueOf(n);
		// it is only for value 1 to 13 not for others
		int res = fact(n);
		System.out.println("fact of "+ n + " is : " +res);
		
		// it is for all values 
		BigInteger res1 = fact1(no);
		System.out.println("fact of "+ n + " is : " +res1);
	}

	private static int fact(int n) {
		if(n>0) {
		if(n == 0 || n==1){
			return 1;
		}
		else {
			return n*fact(n-1);
		}
		}
		return -1;
	}
	
	private static BigInteger fact1(BigInteger no) {
		if(no.longValue()>0) {
			if(no.equals(BigInteger.ZERO) || no.equals(BigInteger.ONE)){
				return BigInteger.ONE;
			}
			else {
				return no.multiply(fact1(no.subtract(BigInteger.ONE)));
			}
		}
		return (BigInteger.ONE).negate();
	}
}
