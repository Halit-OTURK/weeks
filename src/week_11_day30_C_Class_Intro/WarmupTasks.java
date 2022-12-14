package week_11_day30_C_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {


        // 1. write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list); //[0, 0, 2, 0, 3, 0, 4, 1]

        System.out.println(">=<".repeat(33));
        /*
        2. Write a program that can move all the zeros to the last indexes of ArrayList
        no create new arraylist
					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
         */

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int size = list2.size();
        list2.removeAll(Arrays.asList(0));//!!!!!!!!!!!!
        int newsize = list2.size();
        int total = size - newsize;

        for (int i = 0; i < total; i++) {

            list2.add(0);

        }
        System.out.println(list2); // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println(">=<".repeat(33));

        // second way

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list3) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list3) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println(">=<".repeat(33));

     /*  3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>(); // formula the String convert to Character arraylist !!!!!!!!!!!!!
        for (int i = 0; i < str.length(); i++) {

            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);

        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(chars);

        digits.removeIf(p-> !Character.isDigit(p));

        System.out.println(digits);

        ArrayList<Character> special=new ArrayList<>(chars);

        special.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(special);
    }
}
