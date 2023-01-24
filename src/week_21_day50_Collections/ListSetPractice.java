package week_21_day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set <Integer> set= new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4));
        System.out.println(set);

        // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list= new ArrayList<>(set);
        System.out.println(list);

        //  List<String> names = null;
        // System.out.println(names.size());

        System.out.println("=>".repeat(35));

        // pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        System.out.println(chars instanceof Stack);
        System.out.println(chars instanceof ArrayList<Character>);

        (  (Stack)chars ).pop();

        System.out.println("chars = " + chars); //[A, B, C]
        ((Stack) chars).pop();
        System.out.println("chars = " + chars);

        //poll() ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);
        // if we write LinkedList instead of List
        LinkedList<String> names2 = new LinkedList<>(names);

        names2.poll();
        System.out.println(names2);

        names2.poll();
        System.out.println(names2);


    }
}
