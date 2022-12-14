package week_11_day29_ArrayList_CollectionClass;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

      /*  for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 != 0) {

                list.remove(i);
            }
        // even numbers but don't work correct because change index numbers
        }
        System.out.println(list); */


        // => lambda expression!!!!

        list.removeIf(p-> p<5); // remove less then 6 numbers

        System.out.println(list); // [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println("=>".repeat(55));

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(p-> p%2!=0);// p character is not mandatory
        System.out.println(list2);

        System.out.println("=>".repeat(55));

        ArrayList<String> list3=new ArrayList<>();

        list3.addAll(Arrays.asList("java","java","python","c#","javascript","java","java"));

        list3.removeIf(p -> p.startsWith("j"));

        System.out.println(list3); // [python, c#]

        System.out.println("=>".repeat(55));

        // palindrome
        ArrayList<String>names=new ArrayList<>();

        names.addAll(Arrays.asList("anna","racecar","level","eye","java","mert"));

        names.removeIf(name -> StringUtility.isPalindrome(name)); // for each
        System.out.println(names);
    }
}
