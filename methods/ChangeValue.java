package methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an aray
        int [] arr = { 1 , 3 , 2 , 45 , 6};
        change (arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int [] nums){
        nums[0] = 99 ;
    }
}
