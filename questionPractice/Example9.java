package questionPractice;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("If you want to stop the loop enter zero ");
        int n = in.nextInt();
        int sum = 0;
        while (n != 0){
             sum = n +sum ;
            System.out.println(sum);
        n = in.nextInt();
        }if ( n == 0){
            System.out.println(" you entered  zero so loop stopped ");
        }
    }
}
