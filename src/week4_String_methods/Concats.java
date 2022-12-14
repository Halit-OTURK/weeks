package week4_String_methods;

import java.util.Scanner;

public class Concats {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("please enter one word: ");
        String word1= inp.next();
        System.out.print("please enter one word: ");
        String word2= inp.next();

        System.out.println(word1.concat(word2));

        // String firstName = "John ";
        //String lastName = "Doe";
        //System.out.println(firstName.concat(lastName));



    }
}
