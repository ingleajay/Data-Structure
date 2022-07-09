package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountConse1sInArray {

	public static void main(String[] args) {
		
		int[] a = {0,1,1,1,1,0,1,1,1};
		int start = 0;
		int end = a.length-1;
		int i =0;
		List<Integer> count = new ArrayList<Integer>();
		int c=0;
		while(start <= end) {
			if(a[i] == 0)
			{
				i++;
				start++;
				c=0;
			}
			else {
				i++;
				start++;
				c++;
				count.add(c);
			}
		}
		int d = count.stream().max((o1,o2)->(o1.compareTo(o2))).get();
		System.out.println(d);
	}

}
