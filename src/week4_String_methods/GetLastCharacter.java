package week4_String_methods;

import java.util.Scanner;

public class GetLastCharacter {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        System.out.print("please enter sentence:");
        String word= inp.nextLine();
        // get the last charecter

        int lenghtofthestring = word.length();
        int indexOfLastChar = lenghtofthestring-1;
        System.out.println(word.charAt(indexOfLastChar));
    }
}
