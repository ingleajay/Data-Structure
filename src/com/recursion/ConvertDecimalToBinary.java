package com.recursion;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		int no = 20;
		int res = decToBin(no);
		System.out.println("Decimal to binary : " + res);
	}

	private static int decToBin(int no) {
		if(no == 0) {
			return 0;
		}
		else {
			return no%2 +10*decToBin(no/2);
		}
	}

	// 20/2 = 0 , 10
	// 10/2 = 0, 5
	// 5/2 = 1, 2
	// 2/2  =0, 1
	// 1/2 = 1, 0
}
