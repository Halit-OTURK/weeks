package week_11_day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CoolectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        // COLLECTION SORT METHOD

        Collections.sort(list);

        System.out.println(list);

        System.out.println("=>".repeat(55));

        // REVERSE METHOD

        ArrayList<Character> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));

        Collections.reverse(list2);
        System.out.println(list2); // [e, d, c, b, a]
        System.out.println("=>".repeat(55));


        // SWAP METHOD


        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8));
        Collections.swap(list3,1,3);
        System.out.println(list3); // [0, 3, 2, 1, 4, 5, 6, 7, 8]
        System.out.println("=>".repeat(55));

        // max and min METHOD

        ArrayList<Integer>list4=new ArrayList<>();

        list4.addAll(Arrays.asList(11,21,31,41,51,61,71));

        int max=Collections.max(list4);
        int min=Collections.min(list4);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("=>".repeat(55));

        // REPLACEALL METHOD


        ArrayList<Integer> list5=new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,20,30,30,40,50,60,50,10));

        Collections.replaceAll(list5,10,90);

        System.out.println("list5 = " + list5);System.out.println("=>".repeat(55));

        // FREQUENCY METHOD

        int frequency = Collections.frequency(list5, 30 );

        System.out.println("frequency = " + frequency);
        System.out.println("list5 = " + list5);System.out.println("=>".repeat(55));

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("java","java","python","python","python","ruby"));
        int fre=Collections.frequency(names,"java");
        int fre2=Collections.frequency(names,"python");

        System.out.println("fre = " + fre);
        System.out.println("fre2 = " + fre2);


    }


}
