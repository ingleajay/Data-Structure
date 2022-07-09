package com.strings;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
// to findout count of each char and then your diff should be atmost 3

public class FindEquvString1 {

	public static void main(String[] args) {
		
		String word1 = "ce";
		String word2 = "ab";
		System.out.println(checkAlmostEquivalent(word1,word2));
	}
    public static boolean checkAlmostEquivalent(String word1, String word2) {
    	
    	// Take intially empty 26 size of array because we can have a-z char 
    	int[] w1=new int[26];
		int[] w2=new int[26];
		
		// store each char in array but with that do counting of each char to specific index
		// let say we have fisrt c = 99 and a = 97 then index = 2 so  char c of count store in index 2 i.e 1 
		// after that let say if same char is come then their count will update and become 2 
		for(char c:word1.toCharArray()){
			w1[c-'a']++;
		}
		for(char c:word2.toCharArray()){
			w2[c-'a']++;
		}
		
		// here process each array count and find diff and return ans
		for(int i=0;i<w1.length;i++){
			int a=w1[i];
			int b=w2[i];
			if(Math.abs(a-b)>=4){
				return false;
			}
		}
		return true;
    	
    }
}
