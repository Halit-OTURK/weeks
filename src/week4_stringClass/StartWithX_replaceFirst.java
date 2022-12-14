package week4_stringClass;

import java.util.Scanner;

public class StartWithX_replaceFirst {
    public static void main(String[] args) {
        System.out.println("please enter a word:");
        String word= new Scanner(System.in).next();
        if(word.charAt(0)=='x'){
            word = word.replaceFirst("x","a");
        }
        System.out.println(word);




    }
}
