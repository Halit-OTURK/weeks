package week_5_for;

import java.util.Scanner;

public class Convert_reverse {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String word= inp.nextLine();

        String word2 = "";
        for (int i = word.length()-1; i>=0; i--) {
            word2 += word.charAt(i);

        }

        // System.out.println(word2.toUpperCase()); convert and turn all letter to upper
        System.out.println(word2);




    }
}
