package questionPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LagrestInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0){
            int val = 0;
            val += n ;
            System.out.println(val);
            n = in.nextInt();
            if (n == 0){
                int maximum = Math.max(  n , val);
                System.out.println(maximum);
            }
        }
    }
}
