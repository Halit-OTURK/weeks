package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("ahmet", "hakan", "fatma", "ercan", "elif", "fırat"));

        employees.retainAll(Arrays.asList("ercan", "fatma"));

        System.out.println(employees);

        System.out.println(" <=> ".repeat(33));

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        // firstly convert array to Arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.charAt(0) == 'M');

        System.out.println(list);//[Sumeyra, Hasan, Beril] => arraylist

        names=list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));//[Sumeyra, Hasan, Beril] => array


    }
}
