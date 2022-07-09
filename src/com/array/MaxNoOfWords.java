package com.array;

import java.util.StringTokenizer;

public class MaxNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = mostWordsFound(new String[] {"alice and bob love leetcode","i think so too","this is great thanks very much"});
		int n = mostWordsFound1(new String[] {"alice and bob love leetcode","i think so too","this is great thanks very much"});
		System.out.println(m + " " + n);
	}
	
	public static int mostWordsFound(String[] sentences) {
        StringTokenizer fs = new StringTokenizer(sentences[0]," ");
        int max = fs.countTokens();
        for(String i : sentences){
            StringTokenizer s = new StringTokenizer(i," ");
            if(max < s.countTokens()){
                max = s.countTokens();
            }
        }
        return max;
    }

	public static int mostWordsFound1(String[] sentences) {
		int max = sentences[0].split(" ").length;
        for(String i : sentences) {
        	String[] d = i.split("\\s");
            max = Math.max(d.length,max);
        }
        return max;
    }
}
