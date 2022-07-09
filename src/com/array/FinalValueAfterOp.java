package com.array;

public class FinalValueAfterOp {

	public static void main(String[] args) {
		
		System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
	}

	public static int finalValueAfterOperations(String[] operations) {
        int X =0;
        for(String i : operations){
            switch(i){
                case "--X" : --X ;
                             break;
                case "X++" : X++;
                             break;
                case "++X" : ++X;
                             break;  
                case "X--" : X--;
                             break;  
            }
        }
       return X;
    }
}
