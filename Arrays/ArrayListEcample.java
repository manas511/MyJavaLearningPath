package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEcample {
    public static void main(String[] args) {
        //syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(67);
//        list.add(607);
//        list.add(61427);
//        list.add(6427);
//        list.add(6457);
//        list.add(64567);
//
//        System.out.println(list.contains(878));
//
//        list.set(0 , 99);
//
//        list.remove(2);
//        System.out.println(list);
//input
        for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
            System.out.println(list.get(i));//pass index here
        }
//        System.out.println(list);
    }
}
