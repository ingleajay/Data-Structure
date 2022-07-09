package com.recursion;

public class FindFirstUpperCaseLetter {

    // find first upper case from string

    public static void main(String[] args) {
        String str = "ajaAy";
        System.out.println("First Uppercase : " + first(str));
    }

    static char first(String str) {
        if (Character.isUpperCase(str.charAt(0))==false){
            return first(str.substring(1));
        }
        return str.charAt(0);
    }

    // ajaAy
    // a , jaAy
    // j, aAy
    // a, Ay
    // A = return char
}
