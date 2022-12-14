package week4_stringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter first name:");
        String firstName = scan.next();
        System.out.print("please enter second name:");
        String secondName = scan.next();

        char f = firstName.charAt(0);
        char s = secondName.charAt(0);
        String initial = "" + f + s; // when char concatenate String initialize we have to use "" (one space)
        String initial2 = f + "."+ s +".";
                                     // if line has any String value like "," dont have to use "". line must have String value
                                     // if line has String value not necessary write space"" yet
        System.out.println(initial);
        System.out.println(initial2);
        scan.close();
    }
}
