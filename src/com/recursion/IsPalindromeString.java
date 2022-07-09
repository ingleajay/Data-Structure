package com.recursion;

public class IsPalindromeString {

	public static void main(String[] args) {
		String str = "kotok";
		boolean check = isPalindrome(str);
		System.out.println("Is string palindrome : " + check);

	}

	private static boolean isPalindrome(String str) {
		
		if(str.isEmpty() || str.length() == 1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1,str.length()-1));
		}
		return false;
	}
	// kadak
	// k , k = 0,4
	// a, a = 1,3
	// d,d = 2
	
	

}
