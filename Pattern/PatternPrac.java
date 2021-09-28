package Pattern;

public class PatternPrac {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
    }
    static void pattern1(int n){
        for (int row = 0; row <= n; row++) {
            // for every row run the col
            for (int col = 1   ; col < n ; col++) {
                System.out.print("* ");
            }
            // when one row printed we need to add new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 0; row <= n; row++) {
            // for every row run the col
            for (int col = 1   ; col < row ; col++) {
                System.out.print("* ");
            }
            // when one row printed we need to add new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 0; row <= n; row++) {
            // for every row run the col
            for (int col =  1  ; col < n-row +1 ; col++) {
                System.out.print("* ");
            }
            // when one row printed we need to add new line
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 0; row <= n; row++) {
            // for every row run the col
            for (int col =  1  ; col < row ; col++) {
                System.out.print(col);
            }
            // when one row printed we need to add new line
            System.out.println();
        }
    }
//    static void pattern5(int n ){
//        for (int i = 0; i < 2*n; i++) {
//            int c = ;
//            for (int col = 0; col < c; col++) {
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
//    }

}
