package LinearSearch;

public class Linear {
    public static void main(String[] args) {
int nums [] = {23 , 43 ,5,9,336 ,69,6};
int target = 69 ;
int ans = linearSearch(nums , target );
        System.out.println(ans); }
//    search in the array   : return the index if the item found
//    otherwise if item not find return -1
    static int linearSearch(int [] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
//            check for element in every index
        int element = arr[i];
        if(element == target ){
            return i;
        }
        }
        //this line will execute if none of the return statements above ahs ben executreed
        // hence array dose not foiudn
    return -1;
    }
}
