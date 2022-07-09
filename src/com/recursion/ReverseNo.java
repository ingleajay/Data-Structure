package com.recursion;

public class ReverseNo {
    public static void main(String[] args) {

        System.out.println(reverse(88918));
    }

    private static int reverse(int n) {
        if(n == 0 || n == 1)
            return n;
        else{
            int digit = (int)Math.log10(n)+1;
            return reverse(n/10)+(n%10)*((int)Math.pow(10,digit-1));
        }
    }

    // 12345
    // 12345/10 = 1234 , r = 5 = 5*10^3
    // 1234/10 = 123, r = 4    = 4*10^2
    // 123/10 = 12, r = 3      = 3*10^1
    // 12/10 = 1, r = 2        = 2*1^0
    // 1/10 = 0, r=1           = 1
    //                     sum = 54321

}
