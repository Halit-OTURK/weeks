package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 9, 9, 9));

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer each : list) {
            int fre = Collections.frequency(list, each);
            if (fre == 1) {
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("=>".repeat(66));

        // second solution
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 9, 9, 9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf(each -> Collections.frequency(list2,each)>1);

        System.out.println(unique2);

    }
}
