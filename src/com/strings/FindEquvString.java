package com.strings;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
// to findout count of each char and then your diff should be atmost 3

public class FindEquvString {

	public static void main(String[] args) {
		
		String word1 = "ce";
		String word2 = "ab";
		System.out.println(checkAlmostEquivalent(word1,word2));
	}
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        
    	HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0;i<word1.length();i++){
            map1.put(word1.charAt(i),0);
            map2.put(word2.charAt(i),0);
        }
        for(int i=0;i<word1.length();i++){
            char key1 = word1.charAt(i);
            char key2 = word2.charAt(i);
            if(map1.containsKey(key1)){
                int count1 = map1.get(key1);
                map1.put(key1,++count1);
            }
            if(map2.containsKey(key2)){
                int count2 = map2.get(key2);
                map2.put(key2,++count2);
            }
        }
         for(Map.Entry<Character, Integer> entry: map1.entrySet()) {
            if(Math.abs(map2.getOrDefault(entry.getKey(), 0)-entry.getValue()) > 3) {
                return false;
            }
        }
        for(Map.Entry<Character, Integer> entry: map2.entrySet()) {
            if(Math.abs(map1.getOrDefault(entry.getKey(), 0)-entry.getValue()) > 3) {
                return false;
            }
        }
        
        return true;
    }
}
