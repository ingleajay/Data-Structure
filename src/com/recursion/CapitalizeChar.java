package com.recursion;

public class CapitalizeChar {
    public static void main(String[] args) {
        String str = "i love my mom";
        System.out.println(capitalizeWord(str));
    }

    public static String capitalizeWord(String str){
        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
    }

    // i = I => cause str length is one
    // str = i love = length=6

    // => str(4,5) == " " => No
    // cap(str(0,5)+e) => cap(i lov)+e

    // => str(3,4) == " " => No
    // cap(str(0,3)+v) => cap(i lo)+ve

    // => str(2,3) == " " => No
    // cap(str(0,2)+o) => cap(i l)+ove

    // => str(1,2) == " " => No
    // cap(str(0,1)+l) => cap(i )+love

    // => str(-1,1) == " " => Yes
    // cap(str(0,0) => cap(i) + Love

    // cap(i) = I Love

}
