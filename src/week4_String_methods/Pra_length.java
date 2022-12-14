package week4_String_methods;

import java.util.Scanner;

public class Pra_length {
    public static void main(String[] args) {

        //  int length1=a.length();

        Scanner inp= new Scanner(System.in);
        System.out.print("enter 1. word:");
        String a= inp.nextLine();
        int length1=a.length();
        System.out.print("enter 2.word:");
        String b= inp.nextLine();
        int length2=b.length();
        if (length1>length2){
            System.out.println(a);
        } else if (length1<length2) {
            System.out.println(b);
        } else {
            System.out.println("words are equal");
        }
    }
}
