package week4_String_methods;

import java.util.Scanner;

public class FirstCase_charAt {

    public static void main(String[] args) {

        // char sentence1 = sentence.charAt(0);

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter sentence:");

        String sentence = inp.nextLine();

        char sentence1 = sentence.charAt(0);
        char lastChar2 = sentence.charAt(sentence.length() -1);
        System.out.println("sentence1 = " + sentence1);
        System.out.println("lastChar2 = " + lastChar2);




    }


}
