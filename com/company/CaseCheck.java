package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        String word = " Hello";
//        System.out.println(word.charAt(0));
//        System.out.println(ch);
    if ( ch >= 'a' && ch <= 'z' ){
        System.out.println("lower case ");
    }
    else {
        System.out.println("Uppper case ");
    }
    }

}
