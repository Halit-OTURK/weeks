package week_5_for;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {

      /*  String eq = "assddeefgg";
        String result="";

        for (int i = 0; i <eq.length()-1 ; i++) {
             boolean a= eq.indexOf(i)==eq.lastIndexOf(eq.length());

            if (a) {
                result += eq.charAt(i);
            }

        }System.out.println(result);*/
        // this code compare 0 and last index character but we want select and eliminate same characters
        Scanner inp= new Scanner(System.in);
        System.out.print("enter your sentence:");
        String eq = inp.nextLine();
        String result="";
        for (int i = 0; i <eq.length() ; i++) {
            char ch = eq.charAt(i);
            boolean a= eq.indexOf(ch)==eq.lastIndexOf(ch);
            if (a) {
                result += ch;
            }
        }System.out.println(result);
    }
}
