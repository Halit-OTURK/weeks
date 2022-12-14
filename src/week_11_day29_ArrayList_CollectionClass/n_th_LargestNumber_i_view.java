package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class n_th_LargestNumber_i_view {

    public static void main(String[] args) {
        // can't use sort method
/*
1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

     /* 1. way about logic


        list.removeIf(p-> Collections.max(list)==p);// remove the arraylist's 1.max number
        list.removeIf(p-> Collections.max(list)==p);// remove the arraylist's 2.max number
        list.removeIf(p-> Collections.max(list)==p);// remove the arraylist's 3.max number
        list.removeIf(p-> Collections.max(list)==p);// remove the arraylist's 4.max number

        int max=Collections.max(list); // arraylist's 5.max number
       */

        int n = 5;

        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);


        System.out.println("5.max = " + max);
    }
}
