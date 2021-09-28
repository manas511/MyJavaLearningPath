package methods;

import java.sql.SQLOutput;

public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;
        {
             a = 78 ;
             int c = 99;
    // values initialised in this block will be used here only
        }
        System.out.println(a);
        int c = 44 ;
    // scoping in for loops

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
             a = 10;

        }
    }
    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
