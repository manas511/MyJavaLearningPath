package methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2 ,3 ,4 , 5 , 54 ,87,23,45,65);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
