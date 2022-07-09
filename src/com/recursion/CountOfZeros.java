package com.recursion;

public class CountOfZeros {

    public static void main(String[] args) {
        System.out.println(countOfZero(101200,0));
    }

    private static int countOfZero(int n, int c) {

        if(n==0)
            return c;

        int r =n%10;
        if(r == 0){
                return countOfZero(n/10,c+1);
        }
        return countOfZero(n/10,c);

    }

    // 101200 = 10120, c=1
    // 10120 = 1012, c=2
    // 1012 = 101, c=2
    // 101 = 10, c=2
    // 10 = 1, c=3
    // 1 , c = 3
}
