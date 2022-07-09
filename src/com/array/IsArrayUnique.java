package com.array;

import java.util.HashMap;
import java.util.HashSet;

public class IsArrayUnique {
    public static void main(String[] args) {
        System.out.println(isUniqueArray(new int[]{2,3,1,4,1}));
        System.out.println(isUniqueArray1(new int[]{2,3,1,4,1}));
    }

    private static boolean isUniqueArray(int[] ints) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:ints){
            if(set.contains(val)) return true;
            else set.add(val);
        }
        return false;
    }
    private static boolean isUniqueArray1(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 0);
        }
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            if (map.get(a[i]) == 2) {
                return true;
            }
        }
        return false;
    }
}
