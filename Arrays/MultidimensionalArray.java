package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9

         */
        Scanner in = new Scanner(System.in);
//        int[] [] arr = new int[3][];
//        int[][]  arr = {
//                {1 ,2 ,3}, // 0th index
//                {4 ,5 ,6}, // 1st index
//                {7 , 8 ,9} //  2nd index
//        };
//        int [][] arr = new int [3][3];
//        input
        int arr [][] = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
////                arr[row][col] = in.nextInt();
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//    another easy method 
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
    
}
