package com.array;

import java.util.Arrays;

public class MaxProductOftwoNo {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,5,4,5}));
        System.out.println(maxProduct1(new int[]{1,5,4,5}));
    }

    private static int maxProduct1(int[] nums) {
        Arrays.sort(nums);
        return(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    private static int maxProduct(int a[]) {
        int max = 0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(i != j){
                    max = Math.max(((a[i]-1)*(a[j]-1)),max);
                }
            }
        }
        return max;
    }
}
