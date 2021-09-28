package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse ");
        long n = in.nextLong();
        long ans = 0;
        while (n > 0){
            long rem = n % 10;
            n /= 10 ;
            ans = ans *10 +rem ;
        }
        System.out.println(ans );



    }
}
