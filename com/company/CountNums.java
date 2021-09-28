package com.company;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number ");
        long n = in.nextLong();
        System.out.println("Enter which number ocurrence you wanna know");
        int c = in.nextInt();
        int count  = 0;
        while (n > 0){
        long rem = n % 10;
        if (rem  == c ){
            count++;
        }
        n = n / 10;
        }
        System.out.println(count);
    }
}
