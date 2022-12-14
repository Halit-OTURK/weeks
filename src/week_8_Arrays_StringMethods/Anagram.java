package week_8_Arrays_StringMethods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="dbca";

        char [] c1= str1.toCharArray();
        char [] c2 = str2.toCharArray();
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        System.out.println("=".repeat(33));
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));


        System.out.println("=".repeat(33));
        boolean a= Arrays.equals(c1,c2);
        System.out.println(a);
    }
}
