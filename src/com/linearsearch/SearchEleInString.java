package com.linearsearch;

public class SearchEleInString {

	// Easy : Find target character is present in given string or not
	public static void main(String[] args) {
		
		String name = "Ajay";
		char target = 'w';
		int ischeck = search(name,target);
		if(ischeck<0)
			System.out.println(target + " is not present in " + name);
		else
			System.out.println(target + " is present in " + name);

	}

	private static int search(String name,char target) {
	
		// check string should not empty
		if(name.length() < 0)
            return -1;	
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) == target)
				return i;
		}
		
		// this return is for target character is not match in string 
		return -1;
	}
}
