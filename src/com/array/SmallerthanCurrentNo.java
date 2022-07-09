package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Easy : How Many Numbers Are Smaller Than the Current Number
// Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerthanCurrentNo {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
		System.out.println(Arrays.toString(smallerNumbersThanCurrent1(new int[]{8,1,2,2,3})));

	}

	
	public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] t = new int[nums.length];
        List<Integer> l = IntStream.of(nums).boxed().collect(Collectors.toList());
        int k =0;
        for(Integer d :l) {
        	int g = (int) l.stream().filter((i)->i<d).count();
        	t[k] = g;
        	k++;
        }
        return t;
    }
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int k=0;
        int[] t = new int[nums.length];
        for(int i : nums){
            int c = 0;
            for(int j : nums){
               if(j != i && j < i){
                    c++;
                }
            }
            t[k] = c;
            k++;
        }
        return t;
    }

}
