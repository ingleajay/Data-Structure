package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,10,7,15},9)));
        System.out.println(Arrays.toString(twoSum1(new int[]{3,2,3},6)));
    }

    private static int[] twoSum1(int[] nums, int target) {
        int res[] = new int[2];
        // map is basically as [ index value : index ]
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
            System.out.println(map.toString());
        }
        return res;
    }
    // map = {}
    // 9-2 = 7 => check in map - false => { 2 , 0 }
    // 9-10=-1 => false => { 10, 1 }
    // 9-7 = 2 => true => 2 is key present and there value => [ key's value , key ]
    // key = 2 is present it's value is 0 => [ 0, 2 ]


    // T.C = O(n^2)
    private static int[] twoSum(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int sum = a[i]+a[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }



}