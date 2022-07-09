package com.recursion;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "sonlai";
		String res = reverse(str);
		String res1 = reverse1(str);
		System.out.println("Reverse of " + str + " is : " + res + " " + res1);
	}

	private static String reverse1(String str) {
		if(str.isEmpty())
			return str;
		else {
			//System.out.println(reverse(str.substring(1)));
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
	
	// ajay = rev("jay")+a
	// jay = rev("ay")+j
	// ay = rev("y")+a
	// y = ""+y+a+j+a
	

	private static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			//System.out.println(reverse(str.substring(0,str.length()-1)));
			return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
		}
	}

	// ajay= y = y+rev("aja")
	// aja = a = y+a+rev("aj")
	// aj  = j = y+a+j+rev("a")
    // a   = a = y+a+j+a+""
}
