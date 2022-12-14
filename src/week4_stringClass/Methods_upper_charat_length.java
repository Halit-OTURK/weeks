package week4_stringClass;

import java.util.Scanner;

public class Methods_upper_charat_length {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String name = "fkj, alksdf jlaskd jfkl";
        name= name.toUpperCase();
        System.out.println(name);
        String number = "3.45465465465465";
        char forthCharacter = name.charAt(3);
        char tenthCharacter = name.charAt(9);
        System.out.println(forthCharacter+" "+tenthCharacter);

        int totalChars= name.length();
        System.out.println("Total Chars= "+totalChars);// length method===>>......=_____.length();
        char lastChar = name.charAt(totalChars-1);  // ask the last character
        char lastChar2 = name.charAt(name.length() -1);  //2. method to ask the last character---last index number
        System.out.println("lastChar = " + lastChar);
        System.out.println("lastChar = " + lastChar2);
        //int lastnumber= number.charAt(number.length()-1);

        char fifthnumber=number.charAt(4);
        System.out.println("fifthnumber = " + fifthnumber);

    }
}
