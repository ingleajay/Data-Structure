package com.recursion;

public class CountNoOfStepsToZeros {
    // leetcode = https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
    public static void main(String[] args) {
        System.out.println(helper(123,0));
    }

    public static int helper(int n,int c){
        if(n == 0){
            return c;
        }
        if(n % 2 != 0){
            return helper(n-1,c+1);
        }
        else{
            return helper(n/2,c+1);
        }
    }

    // 14, c=1, res=7
    // 7, c=
}
