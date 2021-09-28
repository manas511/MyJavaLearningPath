package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter the Temperature in C :");
        float tempC = sc.nextFloat();

        float tempf = (tempC *9/5)+32;
        System.out.println("Temperature in F:" + tempf);
    }
}
