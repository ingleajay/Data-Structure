package com.recursion;

public class IsPalindromeNo {

    public static void main(String[] args) {
        System.out.println(ispalin(12321));
    }

    private static boolean ispalin(int n) {
        if(reverse(n) == n)
            return true;
        else
            return false;
    }

    private static int reverse(int n) {
        if(n == 0 || n == 1)
            return n;
        else{
            int digit = (int)Math.log10(n)+1;
            return reverse(n/10)+(n%10)*((int)Math.pow(10,digit-1));
        }
    }

}
