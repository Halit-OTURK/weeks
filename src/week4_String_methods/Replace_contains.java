package week4_String_methods;

import java.util.Scanner;

public class Replace_contains {
    public static void main(String[] args) {

        // boolean a = word.contains("ly");

        Scanner inp= new Scanner(System.in);
        System.out.print("Please enter a word:");
        String word=inp.nextLine();
        boolean a = word.contains("ly");
        if(a){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }


    }
}
