package week_11_day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        /*
        int num =1;

        list.remove(num);
        System.out.println(list);
*/

        Integer num = 200;
        boolean b = list.remove(num);
        System.out.println(list);
        System.out.println(b);// true

        Integer num2 = 900;

        boolean b2 = list.remove(num2);
        System.out.println(b2); //false
       /* list.remove(200);
        System.out.println(list); Index 200 out of bounds for length 6
*/


        // CLEAR METHOD => removes everything


        System.out.println("=".repeat(66));

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        // indexof/lastindexof METHOD

        System.out.println("=".repeat(66));


        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('a');
        characters.add('a');
        characters.add('a');
        characters.add('a');
        characters.add('a');

        System.out.println(characters.indexOf('a'));
        System.out.println(characters.lastIndexOf('a'));

        System.out.println("=".repeat(66));

        // contains METHOD => totally same String method

        boolean bl = characters.contains('a');
        boolean bl2 = characters.contains('A');

        System.out.println(bl);
        System.out.println(bl2);

        System.out.println("=".repeat(66));
        // equals METHOD


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);// if we write the 1000 equals turn false

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);// false=> if you use new keyword method must use equal method
        System.out.println(list1.equals(list2)); // true

        System.out.println("=".repeat(66));
        // isEmpty METHOD

        boolean bl3 = list2.isEmpty();
        System.out.println(bl3);
        list2.clear();
        boolean bl4=list2.isEmpty();
        System.out.println(bl4);

        System.out.println("=".repeat(66));
        // .......all METHODs

        ArrayList<Integer>numbers=new ArrayList<>();
        // Bulk Operation=CollectionType

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);

    }
}
