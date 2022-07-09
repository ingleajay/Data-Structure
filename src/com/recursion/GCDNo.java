package com.recursion;

public class GCDNo {

	public static void main(String[] args) {
		
		int no1 = 8;
		int no2 = 12;
		int res = findGCD(no1,no2);
		System.out.println("GCD of two no is :"+res);
	}

	private static int findGCD(int no1, int no2) {
		if(no2==0) {
			return no1;
		}
		else {
			return findGCD(no2, no1%no2);
		}
	}
	
	//  8 = 2*2*2 = 4,2= r = 0
	// 12 = 2*2*3 =6,4,3 = r = 1
	
	// common  = 2*2 = 4
	
	// 7 = 7*1 = 7
	// 49 = 7*7 = 7
	
	// gcd(12,8%12) = gcd(12,8)
	// gcd(8,12%8) = gcd(8,4)
	// gcd(4, 8%4) = gcd(4,0)= 4

}
