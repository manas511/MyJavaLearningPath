package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true ){
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '%'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                double ans ;
                if (op == '+'){
            ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                } if (op == '/'){
                    ans = num1 / num2;
                } if (op == '%'){
                    ans = num1 % num2;
                }
            }
        }
    }
}
