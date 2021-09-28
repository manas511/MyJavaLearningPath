package Arrays;

public class Maxitem {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 5 ,4};
        System.out.println(max(arr));
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end ){
//            swap(arr , start , end);
            start ++;
            end --;
        }
    }
    static int max (int [] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
